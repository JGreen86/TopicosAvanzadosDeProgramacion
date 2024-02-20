package com.ites.sistemas.ejemplosjavafx.componentepersonalizado;

import com.ites.sistemas.milibreria.CardList;
import com.ites.sistemas.milibreria.CardView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ComponentePersonalizadoController implements Initializable {

    @FXML
    private CardList cardList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cardList.addCardView(new CardView("Leche", "$27.50"));
        cardList.addCardView(new CardView("Pan", "$8.00"));
        cardList.addCardView(new CardView("Café", "$30.00"));
    }
}
