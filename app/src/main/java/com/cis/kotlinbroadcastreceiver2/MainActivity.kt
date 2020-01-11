package com.cis.kotlinbroadcastreceiver2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener { view ->
            // val intent = Intent()
            // app1 의 broadcast receiver 실행시키. 명시적 인텐트. 딱 하나만 실행시키게 된다.
            // 실행시킬 패키지명과 클래스명을 모르면 실행시킬 수 없다.
            // intent.setClassName("com.cis.kotlinbroadcastreceiver", "com.cis.kotlinbroadcastreceiver.TestReciever")

            // intent 넘겨주기
            // intent.putExtra("data1", 111)
            // intent.putExtra("data2", 11.11)
            // sendBroadcast(intent)

            // 암시적 인텐트. 안드로이드 버전8.0 이상은 기본적인 암시적 인텐트를 허용하지 않는다. 실행시킬 앱의 Manifast에 intent-filter action 이름을 지정해주면 된다.
            // 암시적 인텐트를 허용할 앱에서 코드를 통해 등록과 해제를 해줘야 사용 가능다.
            // broadcast receiver로 응답할 앱이 실행중일 때만 암시적 인텐트가 실행된다.
             val intent1 = Intent("com.cis.brapp1")

            // intent 넘겨주기
            intent1.putExtra("data1", 111)
            intent1.putExtra("data2", 11.11)
            sendBroadcast(intent1)
        }
    }
}
