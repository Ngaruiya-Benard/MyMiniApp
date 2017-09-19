package practice.com.newpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {
    private static final String StringAfrica = "Algeria," +
            "Angola, " +
            "Benin, " +
            "Botswana, " +
            "Burkina Faso, " +
            "Burundi, " +
            "Cameroon, " +
            "Cape Verde, " +
            "Central African Republic, " +
            "Chad, " +
            "Comoros, " +
            "Congo-Brazzaville, " +
            "Congo-Kinshasa, " +
            "Cote d'Ivoire, " +
            "Djibouti, " +
            "Egypt, " +
            "Equatorial Guinea, " +
            "Eritrea, " +
            "Ethiopia, " +
            "Gabon, " +
            "Gambia, " +
            "Ghana, " +
            "Guinea, " +
            "Guinea Bissau, " +
            "Kenya, " +
            "Lesotho, " +
            "Liberia, " +
            "Libya, " +
            "Madagascar, " +
            "Malawi, " +
            "Mali, " +
            "Mauritania, " +
            "Mauritius, " +
            "Morocco, " +
            "Mozambique, " +
            "Namibia, " +
            "Niger, " +
            "Nigeria, " +
            "Rwanda, " +
            "Senegal, " +
            "Seychelles, " +
            "Sierra Leone, " +
            "Somalia, " +
            "South Africa, " +
            "South Sudan, " +
            "Sudan, " +
            "Swaziland, " +
            "São Tomé and Príncipe, " +
            "Tanzania, " +
            "Togo, " +
            "Tunisia, " +
            "Uganda, " +
            "Western Sahara, " +
            "Zambia, " +
            "Zimbabwe, " +
            ", " +
            "Africa-Wide, " +
            "Central Africa, " +
            "Central Africa Home, " +
            "Angola, " +
            "Burundi, " +
            "Cameroon, " +
            "Central African Republic, " +
            "Chad, " +
            "Congo-Brazzaville, " +
            "Congo-Kinshasa, " +
            "Equatorial Guinea, " +
            "Gabon, " +
            "Rwanda, " +
            "São Tomé and Príncipe, " +
            ", " +
            "East Africa, " +
            "East Africa Home, " +
            "Burundi, " +
            "Comoros, " +
            "Djibouti, " +
            "Eritrea, " +
            "Ethiopia, " +
            "Kenya, " +
            "Madagascar, " +
            "Mauritius, " +
            "Rwanda, " +
            "Seychelles, " +
            "Somalia, " +
            "South Sudan, " +
            "Sudan, " +
            "Tanzania, " +
            "Uganda, " +
            ", " +
            "North Africa, " +
            "North Africa Home, " +
            "Algeria, " +
            "Egypt, " +
            "Libya, " +
            "Morocco, " +
            "Tunisia, " +
            "Western Sahara, " +
            ", " +
            "Southern Africa, " +
            "Southern Africa Home, " +
            "Angola, " +
            "Botswana, " +
            "Lesotho, " +
            "Malawi, " +
            "Mozambique, " +
            "Namibia, " +
            "South Africa, " +
            "Swaziland, " +
            "Zambia, " +
            "Zimbabwe, " +
            ", " +
            "West Africa, " +
            "West Africa Home, " +
            "Benin, " +
            "Burkina Faso, " +
            "Cameroon, " +
            "Cape Verde, " +
            "Cote d'Ivoire, " +
            "Gambia, " +
            "Ghana, " +
            "Guinea, " +
            "Guinea Bissau, " +
            "Liberia, " +
            "Mali, " +
            "Mauritania, " +
            "Niger, " +
            "Nigeria, " +
            "Senegal, " +
            "Sierra Leone, " +
            "São Tomé and Príncipe, " +
            "Togo, ";

    private static final String StringEurope = "Albania, " +
            "Andorra, " +
            "Armenia, " +
            "Austria, " +
            "Azerbaijan, " +
            "B, " +
            "Belarus, " +
            "Belgium, " +
            "Bosnia and Herzegovina, " +
            "Bulgaria, " +
            "C, " +
            "Croatia, " +
            "Cyprus, " +
            "Czech Republic, " +
            "D, " +
            "Denmark, " +
            "E" +
            "" +
            "Estonia, " +
            "F, " +
            "Finland, " +
            "France, " +
            "G, " +
            "Georgia, " +
            "Germany, " +
            "Greece, " +
            "H, " +
            "Hungary, " +
            "I, " +
            "Iceland, " +
            "Ireland, " +
            "Italy, " +
            "K, " +
            "Kazakhstan, " +
            "Kosovo, " +
            "L, " +
            "Latvia, " +
            "Liechtenstein, " +
            "Lithuania, " +
            "Luxembourg, " +
            "M, " +
            "Macedonia (FYROM), " +
            "Malta, " +
            "Moldova, " +
            "Monaco, " +
            "Montenegro, " +
            "N, " +
            "Netherlands, " +
            "Norway, " +
            "P, " +
            "Poland, " +
            "Portugal, " +
            "R, " +
            "Romania, " +
            "Russia, " +
            "S, " +
            "San Marino, " +
            "Serbia, " +
            "Slovakia, " +
            "Slovenia, " +
            "Spain, " +
            "Sweden, " +
            "Switzerland, " +
            "T, " +
            "Turkey, " +
            "U, " +
            "Ukraine, " +
            "United Kingdom (UK), " +
            "V, " +
            "Vatican City";
    private static final String StringAsia = "Afghanistan, " +
            "Armenia, " +
            "Azerbaijan, " +
            "B, " +
            "Bahrain, " +
            "Bangladesh, " +
            "Bhutan, " +
            "Brunei, " +
            "C, " +
            "Cambodia, " +
            "China, " +
            "Cyprus, " +
            "G, " +
            "Georgia, " +
            "I, " +
            "India, " +
            "Indonesia, " +
            "Iran, " +
            "Iraq, " +
            "Israel, " +
            "J, " +
            "Japan, " +
            "Jordan, " +
            "K, " +
            "Kazakhstan, " +
            "Kuwait, " +
            "Kyrgyzstan, " +
            "L, " +
            "Laos, " +
            "Lebanon, " +
            "M " +
            "Malaysia, " +
            "Maldives, " +
            "Mongolia, " +
            "Myanmar (Burma), " +
            "N, " +
            "Nepal, " +
            "North Korea, " +
            "O, " +
            "Oman, " +
            "P, " +
            "Pakistan, " +
            "Palestine, " +
            "Philippines, " +
            "Q, " +
            "Qatar, " +
            "R, " +
            "Russia, " +
            "S, " +
            "Saudi Arabia, " +
            "Singapore, " +
            "South Korea, " +
            "Sri Lanka, " +
            "Syria, " +
            "T, " +
            "Taiwan, " +
            "Tajikistan, " +
            "Thailand, " +
            "Timor-Leste, " +
            "Turkey, " +
            "Turkmenistan, " +
            "U, " +
            "United Arab Emirates (UAE), " +
            "Uzbekistan, " +
            "V, " +
            "Vietnam, " +
            "Y, " +
            "Yemen";
    private static final String StringNorthAmerica = "A, " +
            "Antigua and Barbuda ," +
            "B, " +
            "Bahamas, " +
            "Barbados, " +
            "Belize, " +
            "C, " +
            "Canada, " +
            "Costa Rica, " +
            "Cuba, " +
            "D, " +
            "Dominica, " +
            "Dominican Republic, " +
            "E, " +
            "El Salvador, " +
            "G, " +
            "Grenada, " +
            "Guatemala, " +
            "H, " +
            "Haiti, " +
            "Honduras, " +
            "J, " +
            "Jamaica, " +
            "M ," +
            "Mexico, " +
            "N, " +
            "Nicaragua, " +
            "P, " +
            "Panama, " +
            "S, " +
            "Saint Kitts and Nevis, " +
            "Saint Lucia, " +
            "Saint Vincent and the Grenadines, " +
            "T, " +
            "Trinidad and Tobago, " +
            "U, " +
            "United States of America (USA)";

    private static final String StringSouthAmerica = "A, " +
            "Argentina ," +
            "B, " +
            "Bolivia, " +
            "Brazil, " +
            "C, " +
            "Chile, " +
            "Colombia, " +
            "E, " +
            "Ecuador, " +
            "G, " +
            "Guyana, " +
            "P, " +
            "Paraguay ," +
            "Peru, " +
            "S, " +
            "Suriname, " +
            "U, " +
            "Uruguay, " +
            "V, " +
            "Venezuela";
    private static final String StringAustralia = "A, " +
            "Australia ," +
            "F ," +
            "Fiji ," +
            "K, " +
            "Kiribati, " +
            "M, " +
            "Marshall Islands, " +
            "Micronesia, " +
            "N, " +
            "Nauru, " +
            "New Zealand, " +
            "P, " +
            "Palau, " +
            "Papua New Guinea, " +
            "S, " +
            "Samoa, " +
            "Solomon Islands, " +
            "T, " +
            "Tonga, " +
            "Tuvalu, " +
            "V, , " +
            "Vanuatu";
    private static final String StringAntarctica = "Does Antarctica have countries? No, it does not. The common misconception that the territories claimed by various sovereign nations in Antarctica are independent countries is not correct. This list of all countries in Antarctica is actually a list of the countries that have claimed territory in Antarctica with the names of the Antarctic territories. ";
    ImageView Africa, Asia, Australia, Europe, NorthAmerica, SouthAmerica, Antarctica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Africa = (ImageView) findViewById(R.id.africa);
        Asia = (ImageView) findViewById(R.id.asia);
        Australia = (ImageView) findViewById(R.id.australia);
        Europe = (ImageView) findViewById(R.id.europe);
        NorthAmerica = (ImageView) findViewById(R.id.northamerica);
        SouthAmerica = (ImageView) findViewById(R.id.southamerica);
        Antarctica = (ImageView) findViewById(R.id.antarctica);
        Africa.setOnClickListener(this);
        Asia.setOnClickListener(this);
        Australia.setOnClickListener(this);
        Europe.setOnClickListener(this);
        NorthAmerica.setOnClickListener(this);
        SouthAmerica.setOnClickListener(this);
        Antarctica.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent myIntent = new Intent(MainActivity.this, DetailsActivity.class);
    switch(view.getId()){
        case R.id.africa:
            myIntent.putExtra("name", "africa");
            myIntent.putExtra("africa", StringAfrica);
            startActivity(myIntent);
            break;
        case R.id.asia:
            myIntent.putExtra("name","asia");
            myIntent.putExtra("asia", StringAsia);
            startActivity(myIntent);
            break;

        case R.id.australia:
            myIntent.putExtra("name", "australia");
            myIntent.putExtra("australia", StringAustralia);
            startActivity(myIntent);
            break;

        case R.id.europe:
            myIntent.putExtra("name", "europe");
            myIntent.putExtra("europe", StringEurope);
            startActivity(myIntent);
            break;

        case R.id.northamerica:
            myIntent.putExtra("name", "northamerica");
            myIntent.putExtra("northamerica", StringNorthAmerica);
            startActivity(myIntent);
            break;

        case R.id.southamerica:
            myIntent.putExtra("name","southamerica");
            myIntent.putExtra("southamerica", StringSouthAmerica);
            startActivity(myIntent);
            break;

        case R.id.antarctica:
            myIntent.putExtra("name", "antarctica");
            myIntent.putExtra("antarctica", StringAntarctica);
            startActivity(myIntent);
            break;

        }
    }
}
