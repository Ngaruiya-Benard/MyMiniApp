package practice.com.newpractice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        resultTextView = (TextView) findViewById(R.id.textView);
        Bundle details = getIntent().getExtras();

       String ourname = details.getString("name");
        if(ourname.equals("africa")){
            resultTextView.setText(details.getString("africa"));
        }

        if(ourname.equals("asia")){
            resultTextView.setText(details.getString("asia"));
        }

        if(ourname.equals("australia")){
            resultTextView.setText(details.getString("australia"));
        }

        if(ourname.equals("europe")){
            resultTextView.setText(details.getString("europe"));
        }

        if(ourname.equals("northamerica")){
            resultTextView.setText(details.getString("northamerica"));
        }

        if(ourname.equals("southamerica")){
            resultTextView.setText(details.getString("southamerica"));
        }

        if(ourname.equals("antarctica")){
            resultTextView.setText(details.getString("antarctica"));
        }
    }

}
