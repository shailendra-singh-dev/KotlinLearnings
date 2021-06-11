package KotlinLearnings.src

import java.util.*

private const val NEW_LINE = "\n"
private const val COMMA = ","

private fun getFilledArray(array: Array<String?>, size: Int): Array<String?> {
    val newArray = arrayOfNulls<String>(size)
    var i = 0
    while (i < array.size) {
        newArray[i] = array[i]
        i++
    }
    while (i < size) {
        newArray[i] = ""
        i++
    }
    return newArray
}

fun sortCsvColumns(csvFileContent: String): String? {
    val map: MutableMap<Int, String> = HashMap()
    val mapOfRowsToColumnValues: MutableMap<Int, Array<String?>> = HashMap()
    val mapOfHeaderColumnToValuesList: MutableMap<String?, List<String?>> = HashMap()
    val listOfRows = Arrays.asList(*csvFileContent.split("\\n".toRegex()).toTypedArray())
    for (i in listOfRows.indices) {
        map[i] = listOfRows[i]
    }
    for ((key, value) in map) {
//        mapOfRowsToColumnValues[key] = value.split(COMMA.toRegex()).toTypedArray()
        mapOfRowsToColumnValues.put(key,value.split(COMMA.toRegex()).toTypedArray())
    }
    val rowToCover = listOfRows.size
    val firstRow: Array<String?>? = mapOfRowsToColumnValues[0]
    val firstRowSize: Int? = firstRow?.size
    for (i in 0 until firstRowSize!!) {
        val valuesToPut: MutableList<String?> = ArrayList()
        var j = 1
        while (j < rowToCover) {
            var array = mapOfRowsToColumnValues[j]!!
            array = getFilledArray(array, firstRowSize)
            valuesToPut.add(array[i])
            j++
        }
        mapOfHeaderColumnToValuesList[mapOfRowsToColumnValues[0]!![i]] = valuesToPut
    }
    /**
     * sort the map using keys map key=header column of csv, and value of map is
     * list of rows of that column
     */
    val sorted = TreeMap<String?, List<String?>>(java.lang.String.CASE_INSENSITIVE_ORDER)
    sorted.putAll(mapOfHeaderColumnToValuesList)
    val sb = formStringFromSortedData(map, sorted)
    return sb.toString()
}

private fun formStringFromSortedData(
    map: Map<Int, String>,
    sorted: TreeMap<String?, List<String?>>
): StringBuilder {
    val resultingString = StringBuilder()
    var i = 0
    val keyList: MutableList<String?> = ArrayList()
    // form the first line of resulting string using sorted map
    // keys of the map forms the first row of csv
    for ((key) in sorted) {
        resultingString.append(key)
        keyList.add(key)
        if (i < sorted.size - 1) resultingString.append(COMMA)
        i++
    }
    resultingString.append(NEW_LINE)
    var csvRowsWithoutHeader = 0
    var headerColumnKeys = 0
    while (csvRowsWithoutHeader < map.size - 1 && headerColumnKeys < keyList.size) {
        val key = sorted[keyList[headerColumnKeys]]!![csvRowsWithoutHeader]
        resultingString.append(key)
        // seperate the string with comma
        if (headerColumnKeys < sorted.size - 1) resultingString.append(COMMA)
        headerColumnKeys++
        if (headerColumnKeys == sorted.size) {
            csvRowsWithoutHeader++
            headerColumnKeys = 0
            // don't append newline to last line of csv
            if (csvRowsWithoutHeader < map.size - 1) resultingString.append(NEW_LINE)
        }
    }
    return resultingString
}

fun main(args: Array<String>) {
    val input :String = "Beth,Charles,Danielle,Adam,Eric\n" +
            "17945,10091,10088,3907,10132\n" +
            "2,12,13,48,11"
    print(sortCsvColumns(input))
}