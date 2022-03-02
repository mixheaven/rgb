package idriss.color.model;


import static java.lang.Integer.parseInt;

public class Color {

    private int red;
    private int blue;
    private int green;
    private String hexValue;

    public Color(int red, int green, int blue) {

        if(red < 0 || red >255){
            throw new IllegalArgumentException("Ce nombre ne designe pas une couleur");
        }else{
            this.red = red;
        }

        if(green < 0 || green >255){
            throw new IllegalArgumentException("Ce nombre ne designe pas une couleur");
        }else{
            this.green = green;

        }

        if(blue < 0 || blue >255){
            throw new IllegalArgumentException("Ce nombre ne designe pas une couleur");
        }else {
            this.blue = blue;
        }
        this.hexValue = String.format("#%02X%02X%02X", red, green, blue);


    }
    public Color(String hexValue){
        if(hexValue == null){
            throw new IllegalArgumentException("la valeur est nulle");
        }else if (hexValue.charAt(0) != '#'){
            throw new IllegalArgumentException("le premier charactère ne représente pas une couleur hexadecimal");
        }else if(hexValue.matches("[0-9A-F]+") == false){
            throw new IllegalArgumentException("la séquence hexadecimal n'est pas bonne");
        }else if(hexValue == null){
            throw new IllegalArgumentException("le champs est vide");

        }else{
            this.hexValue = "#" + parseInt(Integer.toHexString(red)) + parseInt(Integer.toHexString(green)) + parseInt(Integer.toHexString(blue));

        }


    }

    public void setRed(int red){
        this.red = red;
    }

    public int getRed(){
        return red;
    }

    public int getGreen(){
        return green;
    }
    public void setGreen(int green){
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    @Override
    public String toString() {
        return  "Couleur hexadécimal : " + hexValue + ", couleur bleu : " + blue + ", couleur vert : " + green + ", couleur rouge : " + red;
    }
}
