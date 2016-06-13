package developments.bravo.ar_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wikitude.architect.ArchitectView;
import com.wikitude.architect.StartupConfiguration;

public class FontPage extends AppCompatActivity {

    private ArchitectView architectView;
    private StartupConfiguration StartupConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fontpage);

        this.architectView = (ArchitectView)this.findViewById( R.id.architectView );
        final StartupConfiguration config = new StartupConfiguration("pYyREUQYWiILTtp1psbJKwbTwj1SzxsG94Dlg+a5HVXDB39o99HT7Heh4PB4NRn12Mu0TYYMW4GwpEx7jTJjVCFETmSJNp0gChe976uHzf3DgmZJEcTb7IvAaQWH260cFzXsI0cuyv2jHe/6aVpp3l+EhnoEGmYABlDCTbJ00apTYWx0ZWRfXyXsiV0LUUiQa3NR1mpmqufCVT4BLM88Baf1cMJgoXRstLpFsVFGv2UCXq7D49M9f1IMFSSxhIKdR2W7JHlLDv/oJLE9VSVtSCKJRzvfv/LQneLsvl9I3maDl3OenAurU0RphXaEu2+/6uEzeQ8H1a+kZq21yyXQo/Dc+Xo2hCEG/bw3Z7xG1oGqsXw3y8znZ9C0wZf99KlYm3/j73/igStvUyFs1VTE4wypw6lnkPSdODzYtCEJZ/lJ7ADkPsC0KRV8HcTkk2fXwp/+IlbFOJA3QKQY/vbu5F3cP5Ap8iH3VCjh5w6hSA79c/YpKE69dGAWUgtnuqSqPO7/Z1cBVQn2JsDLFhn/KBySFR4eLdGsZ02gBJMGlxn1ks1U5DR44oMy0QYoP7XijQ06xhmE/fJGZgM88XwOZKlyJMyxnf+mCaQqCRqR8FruS79XVtvM9GL+hCB9yYv/nPa5taY55SWBCO1ZSe6R4OZJTW+urYtPA2GUEKJO19g=");
        this.architectView.onCreate( config );
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);

        this.architectView.onPostCreate();

        try{
            this.architectView.load( "http://52.17.196.54:6063/3_3d$Models_1_3d$Model$On$Target/index.html" );
        }
        catch (Exception e){

        }
    }

    @Override
    protected void onResume(){
        super.onResume();

        this.architectView.onResume();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        this.architectView.onDestroy();
    }

    @Override
    protected void onPause(){
        super.onPause();

        this.architectView.onPause();
    }
}
