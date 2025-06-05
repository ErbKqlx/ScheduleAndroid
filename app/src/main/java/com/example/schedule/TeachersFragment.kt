package com.example.schedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.core.graphics.toColorInt


class TeachersFragment : Fragment(R.layout.fragment_teachers) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tableLayout = view.findViewById<TableLayout>(R.id.tableLayout)

        val headers = arrayOf("Фамилия", "Имя", "Отчество")
        val headerRow = TableRow(requireContext())
        headerRow.setBackgroundColor("#00A550".toColorInt())

        for (header in headers) {
            val tv = TextView(requireContext()).apply {
                text = header
                setPadding(8, 8, 8, 8)
                setTypeface(null, android.graphics.Typeface.BOLD)
                //setBackgroundColor(Color.LTGRAY)

            }
            headerRow.addView(tv)

        }
        tableLayout.addView(headerRow)

        val data = listOf(
            listOf("Алексеева", "Лариса", "Николаевна"),
            listOf("Артемьева", "Людмила", "Евгеньевна"),
            listOf("Балабанов", "Виталий", "Михайлович"),
            listOf("Бойко", "Светлана", "Михайловна"),
            listOf("Брагина", "Светлана", "Геннадьевна"),
            listOf("Бубнова", "Любовь", "Ивановна"),
            listOf("Воронцова", "Наталья", "Николаевна"),
            listOf("Гайдук", "Светлана", "Юрьевна"),
            listOf("Глуско", "Леонид", "Николаевич"),
            listOf("Гончарова", "Мария", "Афанасьевна"),
            listOf("Горбачев", "Игорь", "Викторович"),
            listOf("Дианова", "Оксана", "Александровна"),
            listOf("Елохина", "Галина", "Александровна"),
            listOf("Емельянова", "Анна", "Евгеньевна"),
            listOf("Енидорцева", "Анна", "Александровна"),
            listOf("Епимахова", "Любовь", "Камилевна"),
            listOf("Игнатова", "Милена", "Денисовна"),
            listOf("Казанцев", "Николай", "Иванович"),
            listOf("Караваева", "Наталья", "Радиславовна"),
            listOf("Квашнин", "Вадим", "Витальевич"),
            listOf("Комарова", "Наталья", "Александровна"),
            listOf("Копанева", "Анастасия", "Анатольевна"),
            listOf("Копина", "Марина", "Геннадьевна"),
            listOf("Кошкина", "Ирина", "Сергеевна"),
            listOf("Крополева", "Яна", "Александровна"),
            listOf("Куриленко", "Дмитрий", "Николаевич"),
            listOf("Лаврентьева", "Ирина", "Владимировна"),
            listOf("Лебедев", "Александр", "Викторович"),
            listOf("Луковкина", "Ирина", "Григорьевна"),
            listOf("Лысков", "Андрей", "Сергеевич"),
            listOf("Лялина", "Татьяна", "Олеговна"),
            listOf("Максимова", "Елена", "Васильевна"),
            listOf("Махнева", "Татьяна", "Михайловна"),
            listOf("Мезенцева", "Надежда", "Николаевна"),
            listOf("Мельникова", "Светлана", "Ивановна"),
            listOf("Мунтян", "Ирина", "Ивановна"),
            listOf("Нохрина", "Елена", "Григорьевна"),
            listOf("Орлова", "Вера", "Валентиновна"),
            listOf("Петрова", "Вероника", "Викторовна"),
            listOf("Петрова", "Екатерина", "Сергеевна"),
            listOf("Попова", "Светлана", "Евгеньевна"),
            listOf("Саламатова", "Елена", "Анатольевна"),
            listOf("Свистунов", "Денис", "Александрович"),
            listOf("Семенова", "Алена", "Анатольевна"),
            listOf("Сипович", "Дмитрий", "Казимирович"),
            listOf("Ситдиков", "Богдан", "Владимирович"),
            listOf("Скукин", "Сергей", "Михайлович"),
            listOf("Скурихина", "Мария", "Анатольевна"),
            listOf("Смирнова", "Марина", "Николаевна"),
            listOf("Тамбулатова", "Валерия", "Евгеньевна"),
            listOf("Тарасенко", "Светлана", "Александровна"),
            listOf("Тихонова", "Наталья", "Робертовна"),
            listOf("Топорков", "Вячеслав", "Алексеевич"),
            listOf("Фадина", "Кристина", "Валерьевна"),
            listOf("Фетисова", "Елена", "Ивановна"),
            listOf("Цветков", "Владимир", "Александрович"),
            listOf("Шакирова", "Асия", "Хаматсалимовна"),
            listOf("Шваб", "Ольга", "Владимировна"),
            listOf("Шихалева", "Любовь", "Александровна"),
            listOf("Шуина", "Ирина", "Владимировна"),
            listOf("Яковлева", "Лолита", "Анатольевна"),
            listOf("Ярышева", "Елена", "Анатольевна"),
            listOf("Герасимова", "Кристина", "Андреевна"),
            listOf("Орлова", "Вера", "Валентинова"),
            listOf("Пульникова", "Лариса", "Юрьевна")
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
                    //setBackgroundColor(Color.WHITE)
                }
                row.addView(tv)
            }

            tableLayout.addView(row)
        }
    }
}