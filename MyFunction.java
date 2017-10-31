package id.co.imastudio1.sinaumaps.helper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.widget.Toast;


public class MyFunction extends AppCompatActivity {
    //variable global
    Animation animation;
    Context c;
    public ProgressDialog mProgressDialog;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c=MyFunction.this;
    }

    public void mytoast(String isipesan){
        Toast.makeText(this, isipesan, Toast.LENGTH_SHORT).show();
    }
    public void myintent(Class kelastujuan){
        startActivity(new Intent(c,kelastujuan));
    }

     public void myanimation(EditText edtanimasi) {
        animation = AnimationUtils.loadAnimation(c, R.anim.animasigetar);
        edtanimasi.setAnimation(animation);
    }
    
    public void showProgressDialog(String tittle) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setTitle(tittle);
            mProgressDialog.setMessage("Loading");
            mProgressDialog.setIndeterminate(true);
        }
        mProgressDialog.show();
    }



}
