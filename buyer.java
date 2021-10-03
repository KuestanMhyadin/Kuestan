public class buyer{

    int id;
    String name;
    long telephone;
    String location;
    String date;

    public buyer () {
        id=1;
        name ="Kuestan";
        location = "hawler";
        telephone = 517629810;
        date ="1/1/2018";
    }
    public buyer (int i, String n,long t,String l,String d) {
        this.id=i;
        this.name=n;
        this.telephone=t;
        this.location=l;
        this.date=d;
    }
    public buyer(int i, int n,long t,String l,String d) {

    }

    public buyer(int i, int n) {
        // TODO Auto-generated constructor stub
    }
    public String getName () {
        return name;
    }
    public int getId() {
        return id;
    }
    public long getTelephone() {
        return telephone;
    }
    public String getLocation() {
        return location;
    }
    public String getDate() {
        return date;
    }
    public void setId(int i) {
        id=i;
    }
    public void setName(String n) {
        name=n;
    }
    public void setTelephone(long t) {
        telephone=t;
    }
    public void setLocation(String l) {
        location = l;
    }
    public void setDate(String d){
        date=d;
    }

    public String toString() {
        return "ID:"+id+ "\n" +"Name:"+name +"\n"+ "Tel:"+telephone +"\n" +"Location: "+location+"\n"+"Date:" +date;
    }



}