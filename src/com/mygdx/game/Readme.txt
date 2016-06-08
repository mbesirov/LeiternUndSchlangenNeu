Es ist eine Grundstruktur angelegt, die nötigen Funktionen müssen wir aber noch schreiben. Zumindest kann man dazwischen herumnavigieren und
die einzelnen Klassen sind miteinander verbunden. Am besten sollten wir uns 1 Stunde oder so zusammensetzen um die genaue Funktionsweise des
Programms zu besprechen, damit jeder auf den neuesten Stand ist, vor allem zum Thema Nutzerverwaltung, Netzwerkverbindung und geplantes Design.

Unten sind die einzelnen Klassen beschrieben sowie die geplante Funktion, die diese erfüllen.


Home
    Hier kannst du entweder das Spiel starten oder Einstellungen vornehmen (Einstellungen sind WIP)

Client
    Hier wird nach einem Host gesucht und man bekommt die Möglichkeit ein Spiel auszuwählen und diesem beizutreten. Es werden alle Spieler des Spieles
    angezeigt. Dann wird gewartet bis der Host das Spiel startet.

    -Suche nach Hosts im Lan
    -Zeige sie an, evtl. dynamisch viele erstellte auswahlfelder(nur 1 gleichzeitig) je nach der anzahl der hosts
    -Verbinde mit Host
    -Warte auf Signal von Host (Bestimmtes Datenpaket, das Spielstart auslöst)
    -Wechsle daraufhin zu ingame Screen

Game_LeiternUndSchlangen
    Startet Game, wird als erstes ausgeführt.

Gaming Screen
    Dorthin joinst du wenn du entweder der Host bist oder als Client beigetreten bist und die Spielsession gestartet wird

Host
    Hier erstellt der Host einen virtuellen Server, es werden ihm alle Spieler angezeigt, die joinen und sobald er bereit ist kann er das Spiel starten
    und alle Clients und er selber starten das Hauptspiel.

    -Erstelle virtuellen Server
    -Zeige joinende Clients an z.B. per Nickname (Wenn das dann funktioniert)
    -Starte per Button, erzwinge Spielstart und erlaube nur den aktuell verbundenen Clients zu joinen
    -Wechsle zu Ingame Screen
    -Falls fixer Server gewünscht:
        +Client verbindet sich zu fixer Adresse und Port
        +Erstellen von virtuellen Server nicht nötig, nur der entsprechende Button muss Startsignal geben.

HostOrClient
    Hier kannst du auswählen ob du hosten willst oder ob du ein Client sein willst

Nickname
    Hier kanns du deinen Nicknamen eingeben. Aus irgendeinem Grund bekomme ich laufend Fehlermeldungen wenn ich ein TextField eingeben will, also
    müssen wir da morgen schauen
    -Eventuell Speichern in Datenbank
    -Einfacher wäre lokal, man muss den Nick so aber immer beim öffnen der Anwendung eingeben
    -Lokal speichern, so muss es nur einmal eingegeben werden

