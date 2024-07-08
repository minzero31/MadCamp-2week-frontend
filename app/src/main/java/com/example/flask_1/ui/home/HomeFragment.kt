package com.example.navigation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flask_1.R

class HomeFragment : Fragment() {

    private lateinit var textCreateQuestion: TextView
    private lateinit var textMyQuestionsTitle: TextView
    private lateinit var recyclerMyQuestions: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        textCreateQuestion = root.findViewById(R.id.text_create_question)
        textMyQuestionsTitle = root.findViewById(R.id.text_my_questions_title)
        recyclerMyQuestions = root.findViewById(R.id.recycler_my_questions)

        // 리사이클러 뷰 설정
        recyclerMyQuestions.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerMyQuestions.adapter = MyQuestionsAdapter(getMyQuestions())

        return root
    }

    private fun getMyQuestions(): List<String> {
        // 여기에 실제 데이터 로직을 추가하세요
        return listOf("Question 1", "Question 2", "Question 3")
    }
}
