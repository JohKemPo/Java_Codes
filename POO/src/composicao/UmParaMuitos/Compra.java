package composicao.UmParaMuitos;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();
    String cliente;

    void addItem(Item item){
        this.itens.add(item);
        item.compra = this;
    }

    /*
     * Uma compra tem muitos itens e um item tem uma comrpa
     * Um pra N ( um para muitos)
     */

    

}
