package com.example.memo

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var db : MemoDatabase
    var memoList = listOf<MemoEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = MemoDatabase.getInstance(this)!!

        val button_add : Button = findViewById(R.id.button_add)
        val edittext_memo : EditText = findViewById((R.id.edittext_memo))
        button_add.setOnClickListener {
            val memo = MemoEntity(null,edittext_memo.text.toString())
            insertMemo(memo)


        }




    }

    //1. Insert Data
    //2. Get Data
    //3. Delete Date
    //4. Set Recycler View
    @SuppressLint("StaticFieldLeak")
    fun insertMemo(memo : MemoEntity){
        //1. MinThread vs WorkerThread(Background Thread)

        val insertTask = object : AsyncTask<Unit, Unit, Unit>(){
            override fun doInBackground(vararg params: Unit?) {
                db.MemoDAO().insert(memo)
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                getAllMemos()
            }

        }
        insertTask.execute()
    }
    @SuppressLint("StaticFieldLeak")
    fun getAllMemos(){
        val getTask = object : AsyncTask<Unit,Unit,Unit>(){
            override fun doInBackground(vararg params: Unit?) {
                memoList = db.MemoDAO().getAll()
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                setRecyclerView(memoList)
            }
        }

        getTask.execute()
    }
    fun deleteMemo(){

    }
    fun setRecyclerView(memoList : List<MemoEntity>){

    }

}


