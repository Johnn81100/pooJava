public class Exemple {
    private String name;
    private String value;
    private Integer nbr;
    public Exemple(){}
    public Exemple(String name, String value, int nbr){
        this.name = name;
        this.value = value;
        this.nbr = nbr;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getValue(){
        return this.value ;
    }
    public void  setValue(String value ){
        this.value= value;
    }

    public Integer getNbr(){
        return this.nbr;
    }
    public void setNbr(Integer nbr){
        this.nbr = nbr;
    }

}
