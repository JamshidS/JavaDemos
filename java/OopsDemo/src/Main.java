public class Main {

    public static void main(String[] args) {

        BaseKrediManager[] kMs = new BaseKrediManager[]{new OgretmenKrediManager(),new OgrenciKrediManaager(),
                new TarimKrediManager()};

        for (BaseKrediManager x: kMs){
            System.out.println(x.hesapla(1000));
        }


    }
}
