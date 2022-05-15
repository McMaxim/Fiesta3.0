package space.sosnovskikh.fiesta30;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Phone extends AppCompatActivity  {

    EditText edit;
    TextView text, Ochared;
    Button button;
    List list =  new ArrayList<Integer>();
    public static List<String> tema = new ArrayList<String>();
    public static List<String> end= new ArrayList<String>();
    static int x = 0;
    static int w = 0;
    static int p = 1;
    static int them;
    static final String[] wetkafilm = {"фильм",
            "кинотеатр",
            "актёр",
            "комедия",
            "попкорн",
            "триллер",
            "зал",
            "смотреть",
            "боевик",
            "ужасы",
            "режиссёр",
            "билет",
            "телевизор",
            "актриса",
            "сериал",
            "драма",
            "театр",
            "экран",
            "сценарий",
            "просмотр",
            "место",
            "ряд",
            "мелодрама",
            "люди",
            "премьера",
            "мультик",
            "смех",
            "сеанс",
            "мультфильм",
            "кола",
            "съёмка",
            "отдых",
            "сюжет",
            "друзья",
            "зритель",
            "афиша",
            "оператор",
            "кадр",
            "снимать",
            "камера",
            "плёнка",
            "фантастика",
            "кресло",
            "кинематограф",
            "любовь",
            "радость",
            "очки",
            "жанр",
            "продюсер",
            "девушка",
            "кинозал",
            "интересное",
            "кинофильм",
            "ужастик",
            "свидание",
            "сцена",
            "лента",
            "поцелуй",
            "артист",
            "искусств",
            "трагедия",
            "игра",
            "титры",
            "романтика",
            "картина",
            "группа",
            "время",
            "слёзы",
            "темнота",
            "трейлер",
            "видео",
            "роль",
            "фэнтези",
            "вечер",
            "реклама",
            "парень",
            "веселье",
            "звук",
            "домино",
            "интересно",
            "кинолента",
            "пара",
            "показ",
            "сценарист",
            "телевидение",
            "монтаж",
            "постановка",
            "детектив",
            "развлечение",
            "страх",
            "музыка",
            "вино",
            "деньги",
            "дети",
            "Голливуд",
            "герой",
            "блокбастер",
            "персонаж",
            "приключения",
            "диван"};
    static final String[] wetkajob = {
            "деньги",
            "зарплата",
            "труд",
            "офис",
            "начальник",
            "профессия",
            "работник",
            "работать",
            "отпуск",
            "усталость",
            "дело",
            "утро",
            "директор",
            "человек",
            "раб",
            "отдых",
            "коллеги",
            "карьера",
            "время",
            "учитель",
            "сила",
            "волк",
            "тяжёлая",
            "заработок",
            "компьютер",
            "сотрудник",
            "завод",
            "босс",
            "премия",
            "обед",
            "семья",
            "дом",
            "учёба",
            "врач",
            "люди",
            "график",
            "коллектив",
            "трудиться",
            "бумаги",
            "не волк",
            "робот",
            "документы",
            "должность",
            "рабочий",
            "будни",
            "задание",
            "бизнес",
            "занятие",
            "жизнь",
            "кофе",
            "работа",
            "увольнение",
            "аванс",
            "прибыль",
            "любимая",
            "начальство",
            "опыт",
            "успех",
            "стол",
            "сон",
            "долг",
            "обязанности",
            "рутина",
            "повышение",
            "доход",
            "шеф",
            "делать",
            "лень",
            "мозг",
            "школа",
            "рано",
            "тяжёлая работа",
            "инженер",
            "оклад",
            "предприятие",
            "понедельник",
            "перерыв",
            "день",
            "дворник",
            "стройка",
            "пенсия",
            "машина",
            "повар",
            "стул",
            "мир",
            "радость",
            "пот",
            "стаж",
            "трудная",
            "рабочие",
            "секретарь",
            "смена",
            "бухгалтер",
            "вставать",
            "фабрика",
            "строитель",
            "оплата",
            "продавец",
            "забота",
    };
    static final String[] wetkahobby = {
            "увлечение",
            "занятие",
            "спорт",
            "интерес",
            "досуг",
            "дело",
            "марки",
            "время",
            "рисование",
            "танцы",
            "игра",
            "музыка",
            "работа",
            "собирать",
            "человек",
            "рукоделие",
            "вязание",
            "любимое",
            "отдых",
            "развлечение",
            "коллекция",
            "свободное",
            "хоббит",
            "привычка",
            "пение",
            "футбол",
            "чтение",
            "коллекционирование",
            "творчество",
            "книги",
            "монеты",
            "заниматься",
            "коллекционировать",
            "шитьё",
            "петь",
            "свободное время",
            "рыбалка",
            "бег",
            "свобода",
            "волейбол",
            "вышивка",
            "друзья",
            "кружок",
            "радость",
            "вышивание",
            "делать",
            "коллекционер",
            "лыжи",
            "времяпровождение",
            "гитара",
            "еда",
            "любовь",
            "макраме",
            "прогулка",
            "интересное",
            "удовольствие",
            "искусство",
            "плавание",
            "бабочки",
            "баскетбол",
            "готовка",
            "деньги",
            "жизнь",
            "значки",
            "поделки",
            "теннис",
            "увлекаться",
            "фантики",
            "шахматы",
            "школа",
            "любимое занятие",
            "деятельность",
            "талант",
            "охота",
            "бокс",
            "велосипед",
            "веселье",
            "времяпрепровождение",
            "гимнастика",
            "дом",
            "животные",
            "интересно",
            "лето",
            "люди",
            "собирательство",
            "стихи",
            "учёба",
            "хоккей",
            "хор",
            "марка",
            "интересный",
            "клуб",
            "страсть",
            "профессия",
            "хобби",
            "весёлое",
            "вечер",
            "достижение",
            "желание",
            "кино"
    };
    static final String[] wetkapet = {
            "собака",
            "кошка",
            "попугай",
            "кормить",
            "кот",
            "животное",
            "любимец",
            "хомяк",
            "домашний",
            "забота",
            "корм",
            "рыбки",
            "питомник",
            "дом",
            "хозяин",
            "любимый",
            "домашнее",
            "питон",
            "щенок",
            "кличка",
            "котёнок",
            "крыса",
            "ухаживать",
            "свинка",
            "уход",
            "клетка",
            "зверь",
            "друг",
            "любовь",
            "мышь",
            "хорёк",
            "пёс",
            "кролик",
            "ветеринар",
            "зоопарк",
            "птица",
            "живность",
            "зверёк",
            "черепаха",
            "воспитанник",
            "дикий",
            "змея",
            "ласка",
            "любить",
            "малыш",
            "мышка",
            "радость",
            "ребёнок",
            "шерсть",
            "любимчик",
            "пудель",
            "попугайчик",
            "собачонок",
            "кошки",
            "животные",
            "киса",
            "домашние животные",
            "заботливость",
            "собачка",
            "крольчиха",
            "фауна",
            "поводок",
            "кормление",
            "обитатель",
            "Тузик",
            "пёсик",
            "порода",
            "дружок",
            "ошейник",
            "котопёс",
            "няшный",
            "счастье",
    };
    static final String[] wetkatravaling= {
            "самолёт",
            "море",
            "отдых",
            "поезд",
            "дорога",
            "отпуск",
            "путь",
            "страна",
            "машина",
            "путешественник",
            "поездка",
            "пляж",
            "горы",
            "турист",
            "чемодан",
            "поход",
            "круиз",
            "рюкзак",
            "мир",
            "приключение",
            "билет",
            "город",
            "солнце",
            "туризм",
            "полёт",
            "радость",
            "отель",
            "палатка",
            "автобус",
            "автостоп",
            "деньги",
            "тур",
            "карта",
            "лето",
            "Турция",
            "корабль",
            "экскурсия",
            "путешествовать",
            "люди",
            "курорт",
            "вояж",
            "багаж",
            "путёвка",
            "друзья",
            "костёр",
            "Египет",
            "лес",
            "семья",
            "океан",
            "остров",
            "интерес",
            "счастье",
            "кругосветное путешествие",
            "шествие",
            "песок",
            "еда",
            "земля",
            "любовь",
            "трип",
            "шар",
            "кругосветное",
            "путник",
            "ехать",
            "заграница",
            "время",
            "природа",
            "веселье",
            "вода",
            "впечатления",
            "гид",
            "странствие",
            "маршрут",
            "каникулы",
            "перелёт",
            "пальма",
            "фотографии",
            "человек",
            "сумка",
            "паспорт",
            "транспорт",
            "вокруг света",
            "достопримечательности",
            "небо",
            "свет",
            "новое",
            "виза",
            "путеводитель",
            "компас",
            "сувениры",
            "гостиница",
            "аэропорт",
            "лодка",
            "велосипед",
            "автомобиль",
            "фото",
            "озеро",
            "Америка",
            "Европа",
            "вещи",
            "далёко"
    };
    static final String[] wetkasport= {
            "футбол",
            "бег",
            "спортсмен",
            "баскетбол",
            "здоровье",
            "волейбол",
            "мяч",
            "хоккей",
            "соревнование",
            "игра",
            "Олимпиада",
            "теннис",
            "сила",
            "тренер",
            "плавание",
            "лыжи",
            "бокс",
            "победа",
            "тренировка",
            "прыжки",
            "жизнь",
            "спортивный",
            "чемпион",
            "медаль",
            "шахматы",
            "мышцы",
            "кроссовки",
            "атлетика",
            "штанга",
            "матч",
            "чемпионат",
            "физкультура",
            "травма",
            "гимнастика",
            "команда",
            "судья",
            "спортзал",
            "стадион",
            "биатлон",
            "фитнес",
            "заниматься",
            "ракетка",
            "коньки",
            "танцы",
            "гольф",
            "гантели",
            "борьба",
            "зал",
            "велосипед",
            "регби",
            "тренажёр",
            "гандбол",
            "занятие",
            "пот",
            "олимпийские игры",
            "рекорд",
            "награда",
            "гол",
            "вода",
            "пресс",
            "финиш",
            "турнир",
            "форма",
            "человек",
            "атлет",
            "мускулы",
            "старт",
            "клюшка",
            "ворота",
            "труд",
            "болельщики",
            "шайба",
            "кубок",
            "движение",
            "скорость",
            "велоспорт",
            "выносливость",
            "допинг",
            "скакалка",
            "бейсбол",
            "время",
            "достижения",
            "дух",
            "лёгкая атлетика",
            "упражнения",
            "бассейн",
            "тело",
            "успех",
            "гонки",
            "поле",
            "гиря",
            "игроки",
            "фигурное катание",
            "зарядка",
            "ходьба",
            "счёт",
            "мастер",
            "снаряд",
            "Сочи",
            "боль"


    };



    boolean[] wetkaB = {false, false, false, false, false, false};

    public int rand() {
        int rand = (int) (Math.random() * 6);
        if (wetkaB[rand]) {
            return rand();
        }
        wetkaB[rand] = true;
        return rand;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banan1);
        Log.d("mim", "onCreate: "+tema.size()+" "+end.size()+" "+x+" "+w+" "+p+" "+them);





        end.add("0");
        end.add("0");
        end.add("0");
        end.add("0");
        end.add("0");
        for(int i = 0; i< end.size(); i++) {
            Log.d("my",end.get(i)+"аааааааааааа"+i );
        }
        Log.d("my", "list size: " + end.size());
        edit = findViewById(R.id.edit);
        Ochared = findViewById(R.id.Ochared);
        text = findViewById(R.id.view);
        button = findViewById(R.id.button);
        them = MainActivity.getThemes();
        Log.d("my", "kjsdhgie");


            if (them == 1){
                //работа
                for (int i = 0; i < 5; i++) {
                    double a = Math.random()*99;
                    int b = (int) a;
                    if (list.contains(b)){

                    }
                    else {
                        list.add(b);
                        tema.add(wetkajob[b]);

                    }
                }

            }
            if (them == 2){
                //хобби

                    for (int i = 0; i < 5; i++) {
                        double a = Math.random() * 99;
                        int b = (int) a;
                        if (list.contains(b)) {

                        } else {
                            list.add(b);
                            tema.add(wetkahobby[b]);
                        }
                    }

                }
        if (them == 4){
            //путешествия

            for (int i = 0; i < 5; i++) {
                double a = Math.random() * 99;
                int b = (int) a;
                if (list.contains(b)) {

                } else {
                    list.add(b);
                    tema.add(wetkatravaling[b]);

                }
            }

        }



        if (them == 3){
                // дом животное
                for (int i = 0; i < 5; i++) {
                    double a = Math.random() * 60;
                    int b = (int) a;
                    if (list.contains(b)) {

                    } else {
                        list.add(b);
                        tema.add(wetkapet[b]);

                    }
                }


                }
            if (them == 0){
                Log.d("my", "onCreate: ");
                //фильм
                for (int i = 0; i < 5; i++) {
                    double a = Math.random() * 99;
                    int b = (int) a;
                    if (list.contains(b)) {

                    } else {
                        list.add(b);
                        tema.add(wetkafilm[b]);

                    }
                }


                }
            if (them == 5){
                //спорт
                for (int i = 0; i < 5; i++) {
                    double a = Math.random() * 99;
                    int b = (int) a;
                    if (list.contains(b)) {

                    } else {
                        list.add(b);
                        tema.add(wetkasport[b]);

                    }



                }

            }
        text.setText( tema.get(w / MainActivity.a));
        Ochared.setText("Очередь игрока "+p);
        p+=1;
        edit.setText("");
        Log.d("mmmm", ""+tema.size());






        //первая вставка элемента
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(edit.getText().toString().equals(".")  || edit.getText().toString().equals(text.getText().toString()) ||
                edit.getText().toString().equals("")  || edit.getText().toString().equals(" ")  || edit.getText().toString().equals("  ")  )){
                    Log.d("my", "Проерку прошло");

                    Log.d("my", edit.getText().toString());

                if (w<(MainActivity.a)*5-1) {


                    Ochared.setText("Очередь игрока "+p);
                    if(p == 2){
                        p = 0;
                    }
                    p+=1;
                    if (x < (MainActivity.a -1)) {
                        Log.d("my",  x+","+w+","+MainActivity.a);


                        swap();
                        x++;
                        w++;
                    }
                    else if (x % (MainActivity.a-1) == 0) {
                        x = 0;
                        Log.d("my",  x+","+w+","+MainActivity.a);
                        Log.d("my",  "банан");

                        w++;
                        end.set(w / MainActivity.a-1, edit.getText().toString());
                        Log.d("my", "index: "+w / MainActivity.a);
                        Log.d("my", "value: "+edit.getText().toString());
                        Log.d("my", "elem: "+end.get(w / MainActivity.a));
                        edit.setText("");
                        text.setText( tema.get(w /(MainActivity.a)));
                    }

                    Log.d("my",  x+","+w+","+MainActivity.a);

                }
                else{

                    end.set(4, edit.getText().toString());

                    Log.d("my", "list size: " + end.size());
                    for(int i = 0; i< end.size(); i++) {
                        Log.d("my",end.get(i)+"аааааааааааа" +i);
                    }
                    x =0;
                    w=0;

                    Intent intent = new Intent(Phone.this,Osnova.class);
                    //пройдет?
                    startActivity(intent);




                    }}


            }
        });





        if (MainActivity.ump== 0){
        play();
    }}
    public void swap() {
        if (!(edit.getText().toString().length() < 2)) {
            text.setText(edit.getText().toString());
            edit.setText("");
        }
    }




    public void play(){

        MainActivity.mPlayer.start();
    }


}


