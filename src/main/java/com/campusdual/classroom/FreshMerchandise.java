package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    protected Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date data){
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = data;
    }

    public String getFormattedDate(Date date){
        SimpleDateFormat sDf = new SimpleDateFormat("dd-MM-yyyy");
        return sDf.format(date);
    }

    public Date getExpirationDate(){
        return this.expirationDate;
    }

    @Override
    public Object getSpecificData() {
        StringBuilder str = new StringBuilder();
        str.append("Localización: ");
        str.append(getLocation());
        str.append("\r\n");
        str.append("Caducidad: ");
        str.append(getFormattedDate(getExpirationDate()));
        str.append("\r\n");
        str.append("Producto: ");
        str.append(name);
        str.append("\r\n");
        str.append("Id: ");
        str.append(uniqueId);
        str.append("\r\n");
        str.append("Responsible Id: ");
        str.append(responsibleId);
        str.append("\r\n");
        str.append("zona: ");
        str.append(zone);
        str.append("\r\n");
        str.append("area: ");
        str.append(area);
        str.append("\r\n");
        str.append("shelf: ");
        str.append(shelf);
        str.append("\r\n");
        str.append("quantity: ");
        str.append(quantity);
        return str.toString();
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }
}
