package com.bluesky.kotlinmall.utils

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 *
 * @author BlueSky
 * @date 2023/6/20
 * Description:
 */
class FileUtil {

    companion object {

        /**
         * Reads the contents of a file.
         *
         * @param file The file to read from.
         * @return The contents of the file as a string.
         */
        fun readFile(file: File): String {
            val inputStream = FileInputStream(file)
            val reader = BufferedReader(InputStreamReader(inputStream))
            val contents = StringBuilder()

            try {
                var line = reader.readLine()
                while (line != null) {
                    contents.append(line)
                    line = reader.readLine()
                }
            } finally {
                reader.close()
            }

            return contents.toString()
        }

        /**
         * Writes the contents of a string to a file.
         *
         * @param file The file to write to.
         * @param contents The contents of the file as a string.
         */
        fun writeFile(file: File, contents: String) {
            val outputStream = FileOutputStream(file)
            val writer = BufferedWriter(OutputStreamWriter(outputStream))

            try {
                writer.write(contents)
            } finally {
                writer.close()
            }
        }
    }
}