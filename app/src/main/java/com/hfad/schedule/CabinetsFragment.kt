package com.hfad.schedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.core.graphics.toColorInt

class CabinetsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cabinets, container, false)

        val tableLayout = view.findViewById<TableLayout>(R.id.tableLayout)

        val headers = arrayOf("Номер", "Учебный корпус")
        val headerRow = TableRow(requireContext())
        headerRow.setBackgroundColor("#00A550".toColorInt())

        for (header in headers) {
            val tv = TextView(requireContext()).apply {
                text = header
                setPadding(8, 8, 8, 8)
                setTypeface(null, android.graphics.Typeface.BOLD)
                setBackgroundResource(R.drawable.table_cell_border)
            }
            headerRow.addView(tv)

        }
        tableLayout.addView(headerRow)

        val data = listOf(
            listOf("каб. 107", "УК № 1 Ладыж. 7"),
            listOf("каб. 111", "УК № 1 Ладыж. 7"),
            listOf("каб. 201", "УК № 1 Ладыж. 7"),
            listOf("каб. 202", "УК № 1 Ладыж. 7"),
            listOf("каб. 209", "УК № 1 Ладыж. 7"),
            listOf("каб. 210", "УК № 1 Ладыж. 7"),
            listOf("каб. 212", "УК № 1 Ладыж. 7"),
            listOf("каб. 214", "УК № 1 Ладыж. 7"),
            listOf("каб. 215", "УК № 1 Ладыж. 7"),
            listOf("каб. 216", "УК № 1 Ладыж. 7"),
            listOf("каб. 217", "УК № 1 Ладыж. 7"),
            listOf("каб. 218", "УК № 1 Ладыж. 7"),
            listOf("каб. 301", "УК № 1 Ладыж. 7"),
            listOf("каб. 302", "УК № 1 Ладыж. 7"),
            listOf("чит. зал", "УК № 1 Ладыж. 7"),
            listOf("каб. 303", "УК № 1 Ладыж. 7"),
            listOf("каб. 305", "УК № 1 Ладыж. 7"),
            listOf("каб. 306", "УК № 1 Ладыж. 7"),
            listOf("каб. 308", "УК № 1 Ладыж. 7"),
            listOf("каб. 309", "УК № 1 Ладыж. 7"),
            listOf("каб. 312", "УК № 1 Ладыж. 7"),
            listOf("каб. 313", "УК № 1 Ладыж. 7"),
            listOf("каб. 314", "УК № 1 Ладыж. 7"),
            listOf("каб. 315", "УК № 1 Ладыж. 7"),
            listOf("каб. 316", "УК № 1 Ладыж. 7"),
            listOf("каб. 317", "УК № 1 Ладыж. 7"),
            listOf("каб. 318", "УК № 1 Ладыж. 7"),
            listOf("каб. 307/1", "УК № 1 Ладыж. 7"),
            listOf("каб. 319", "УК № 1 Ладыж. 7"),
            listOf("спортивный зал", "УК № 1 Ладыж. 7"),
            listOf("каб. 105", "УК № 1 Ладыж. 7"),
            listOf("каб. 233", "УК № 2 Чапаева 28"),
            listOf("каб. 110", "УК № 2 Чапаева 28"),
            listOf("каб. 112", "УК № 2 Чапаева 28"),
            listOf("каб. 121", "УК № 2 Чапаева 28"),
            listOf("каб. 124", "УК № 2 Чапаева 28"),
            listOf("каб. 125", "УК № 2 Чапаева 28"),
            listOf("каб. 126", "УК № 2 Чапаева 28"),
            listOf("каб. 131", "УК № 2 Чапаева 28"),
            listOf("каб. 132", "УК № 2 Чапаева 28"),
            listOf("каб. 133", "УК № 2 Чапаева 28"),
            listOf("каб. 134", "УК № 2 Чапаева 28"),
            listOf("каб. 135", "УК № 2 Чапаева 28"),
            listOf("каб. 221", "УК № 2 Чапаева 28"),
            listOf("каб. 222", "УК № 2 Чапаева 28"),
            listOf("каб. 226", "УК № 2 Чапаева 28"),
            listOf("каб. 231", "УК № 2 Чапаева 28"),
            listOf("каб. 232", "УК № 2 Чапаева 28"),
            listOf("каб. 234", "УК № 2 Чапаева 28"),
            listOf("каб. 235", "УК № 2 Чапаева 28"),
            listOf("каб. 236", "УК № 2 Чапаева 28"),
            listOf("каб. 237", "УК № 2 Чапаева 28"),
            listOf("каб. 241", "УК № 2 Чапаева 28"),
            listOf("каб. 242", "УК № 2 Чапаева 28"),
            listOf("каб. 243", "УК № 2 Чапаева 28"),
            listOf("каб. 244", "УК № 2 Чапаева 28"),
            listOf("каб. 2", "УК № 2 Чапаева 28"),
            listOf("каб. 4", "УК № 2 Чапаева 28"),
            listOf("каб. 5", "УК № 2 Чапаева 28"),
            listOf("каб. 7", "УК № 2 Чапаева 28"),
            listOf("каб. 17", "УК № 3 Ленингр. 1"),
            listOf("каб. 25", "УК № 3 Ленингр. 1"),
            listOf("каб. 26", "УК № 3 Ленингр. 1"),
            listOf("каб. 27", "УК № 3 Ленингр. 1"),
            listOf("каб. 31", "УК № 3 Ленингр. 1"),
            listOf("каб. 36", "УК № 3 Ленингр. 1"),
            listOf("каб. 37", "УК № 3 Ленингр. 1"),
            listOf("каб. 38", "УК № 3 Ленингр. 1"),
            listOf("каб. 12", "УК № 3 Ленингр. 1"),
            listOf("каб. 11", "УК № 3 Ленингр. 1"),
            listOf("каб. 15", "УК № 3 Ленингр. 1")
        );

        for ((index, rowData) in data.withIndex()) {
            val row = TableRow(requireContext())

            if (index % 2 == 1) {
                row.setBackgroundColor("#A8E6A1".toColorInt())
            }

            for (cellData in rowData) {
                val tv = TextView(requireContext()).apply {
                    text = cellData
                    setPadding(8, 8, 8, 8)
                    setBackgroundResource(R.drawable.table_cell_border)
                }
                row.addView(tv)
            }

            tableLayout.addView(row)
        }

        return view;
    }
}