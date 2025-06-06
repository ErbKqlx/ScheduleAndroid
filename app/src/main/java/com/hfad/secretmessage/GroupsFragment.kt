package com.hfad.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.core.graphics.toColorInt


class GroupsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_groups, container, false)

        val tableLayout = view.findViewById<TableLayout>(R.id.tableLayout)

        val headers = arrayOf("Название", "Курс", "Куратор", "Год поступления", "Год окончания")
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
            listOf("ИС-22", 3, "Петрова Екатерина Сергеевна", 2022, 2026),
            listOf("ИС-23", 2, "Ярышева Елена Анатольевна", 2023, 2027),
            listOf("ИС-24", 1, "Копина Марина Геннадьевна", 2024, 2028),
            listOf("КТ-23", 2, "Яковлева Лолита Анатольевна", 2023, 2026),
            listOf("ОДЛ-22", 3, "Балабанов Виталий Михайлович", 2022, 2025),
            listOf("ОДЛ-23", 2, "Балабанов Виталий Михайлович", 2023, 2026),
            listOf("ОДЛ-24-1", 1, "Цветков Владимир Александрович", 2024, 2027),
            listOf("ОДЛ-24-2", 1, "Брагина Светлана Геннадьевна", 2024, 2027),
            listOf("ОПИ-21", 4, "Махнева Татьяна Михайловна", 2021, 2025),
            listOf("ОПИ-22", 3, "Мельникова Светлана Ивановна", 2022, 2026),
            listOf("ОПИ-24", 1, "Мельникова Светлана Ивановна", 2024, 2028),
            listOf("ОР-23", 2, "Гончарова Мария Афанасьевна", 2023, 2027),
            listOf("ПБ-21", 4, "Смирнова Марина Николаевна", 2021, 2025),
            listOf("ПБ-23", 2, "Емельянова Анна Евгеньевна", 2023, 2027),
            listOf("ПК-21",4 ,"Луковкина Ирина Григорьевна",2021 ,2025 ),
            listOf("ПК-22-1",3 ,"Луковкина Ирина Григорьевна",2022 ,2026 ),
            listOf("ПК-22-2",3 ,"Лаврентьева Ирина Владимировна",2022 ,2026 ),
            listOf("ПК-23-1",2 ,"Лаврентьева Ирина Владимировна",2023 ,2027 ),
            listOf("ПК-23-2",2 ,"Епимахова Любовь Камилевна",2023 ,2027 ),
            listOf("ПК-24",1 ,"Комарова Наталья Александровна",2024 ,2028 ),
            listOf("ПО-22",3 ,"Емельянова Анна Евгеньевна",2022 ,2025 ),
            listOf("ПО-24",1 ,"Герасимова Кристина Андреевна",2024 ,2026 ),
            listOf("ПР-22",3 ,"Орлова Вера Валентиновна",2022 ,2025 ),
            listOf("ПР-23", 2, "Воронцова Наталья Николаевна", 2023, 2026),
            listOf("РГО-22", 3, "Крополева Яна Александровна", 2022, 2025),
            listOf("РГО-23", 2, "Шуина Ирина Владиславовна", 2023, 2025),
            listOf("РГО-24", 1, "Попова Светлана Евгеньевна", 2024, 2027),
            listOf("СМ-22", 3, "Свистунов Денис Александрович", 2022, 2025),
            listOf("СМ-23", 2, "Елохина Галина Александровна", 2023, 2025),
            listOf("СМ-24", 1, "Свистунов Денис Александрович", 2024, 2026),
            listOf("СП-22", 3, "Семенова Алена Анатольевна", 2022, 2025),
            listOf("СП-23", 2, "Семенова Алена Анатольевна", 2023, 2025),
            listOf("СП-24", 1, "Крополева Яна Александровна", 2024, 2026),
            listOf("ТД-24", 1, "Бойко Светлана Михайловна", 2024, 2027),
            listOf("ЧС-21", 4, "Куриленко Дмитрий Николаевич", 2021, 2025),
            listOf("ЧС-22",3 , "Мунтян Ирина Ивановна",2022 ,2026 ),
            listOf( "ЧС-23" ,2 , "Мунтян Ирина Ивановна",2023 ,2027 ),
            listOf( "ЧС-24" ,1 , "Тамбулатова Валерия Евгеньевна",2024 ,2028 ),
            listOf( "ЭБК-22" ,3 , "Брагина Светлана Геннадьевна" ,2022 ,2025 ),
            listOf( "ЭРО-21-1" ,4 , "Шихалева Любовь Александровна" ,2021 ,2025 ),
            listOf( "ЭРО-21-2" ,4 , "Гончарова Мария Афанасьевна" ,2021 ,2025 ),
            listOf( "ЭРО-22" ,3 , "Шихалева Любовь Александровна" ,2022 ,2026 ),
            listOf( "ЭРО-23" ,2 , "Максимова Елена Васильевна" ,2023 ,2027 ),
            listOf( "ЭРО-24" ,1 , "Шваб Ольга Владимировна" ,2024 ,2028 ),
            listOf( "П(А)-24" ,1 , "Пульникова Лариса Юрьевна" ,2024 ,2026 )
        );

        for ((index, rowData) in data.withIndex()) {
            val row = TableRow(requireContext())

            if (index % 2 == 1) {
                row.setBackgroundColor("#A8E6A1".toColorInt())
            }

            for (cellData in rowData) {
                val tv = TextView(requireContext()).apply {
                    text = cellData.toString()
                    setPadding(8, 8, 8, 8)
                    setBackgroundResource(R.drawable.table_cell_border)
                }
                row.addView(tv)
            }

            tableLayout.addView(row)
        }

        return view
    }

}