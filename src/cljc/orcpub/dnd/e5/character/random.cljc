(ns orcpub.dnd.e5.character.random
  (:require [clojure.string :as s]))

(def calishite-names
  {:male ["Aseir"
          "Bardeid"
          "Haseid"
          "Khemed"
          "Mehmen"
          "Sudeiman"
          "Zashier"
          "Pasha"
          "Faruk"
          "Kwala"
          "Abbas"
          "Ashkan"
          "Ahmad"
          "Ali"
          "Amin"
          "Amir"
          "Ardashir"
          "Afshin"
          "Arshad"
          "Arman"
          "Armin"
          "Amir"
          "Arash"
          "Ardeshir"
          "Arvin"
          "Arwin"
          "Ashem"
          "Astash"
          "Bijan"
          "Babak"
          "Bahrom"
          "Bardia"
          "Basir"
          "Behnam"
          "Dalir"
          "Dariush"
          "Davoud"
          "Darafsh"
          "Ervin"
          "Erwin"
          "Ehsan"
          "Eskandar"
          "Esmail"
          "Izad"
          "Farhad"
          "Farbod"
          "Farrokh"
          "Farhid"
          "Giv"
          "Goshtasp"
          "Hamid"
          "Hassan"
          "Hirbod"
          "Hashem"
          "Hormuzd"
          "Jamshid"
          "Javad"
          "Kamran"
          "Karim"
          "Kasra"
          "Kazem"
          "Khashayr"
          "Khosrow"
          "Kiarash"
          "Kourosh"
          "Mazdak"
          "Mazdan"
          "Maziar"
          "Mehran"
          "Manuchehr"
          "Marduk"
          "Mehrdad"
          "Marzban"
          "Medhi"
          "Meysam"
          "Milad"
          "Mir"
          "Mithradates"
          "Musa"
          "Omid"
          "Papak"
          "Parizad"
          "Parsa"
          "Parviz"
          "Payam"
          "Pedram"
          "Piruz"
          "Pouria"
          "Ramin"
          "Reza"
          "Rostam"
          "Sadegh"
          "Sajad"
          "Saman"
          "Samir"
          "Sassan"
          "Sepehr"
          "Shahin"
          "Shapour"
          "Shahryar"
          "Shervin"
          "Sohrab"
          "Souroush"
          "Tirdad"
          "Turan"
          "Vahid"
          "Vandad"
          "Varshasp"
          "Yaghoub"
          "Yahya"
          "Younes"
          "Yazdan"
          "Zand"
          "Zartosht"
          "Zurvan"]
   :female ["Atala"
            "Ceidil"
            "Hama"
            "Jasmal"
            "Meilil"
            "Seipora"
            "Yasheira"
            "Zasheida"
            "Oma"
            "Anahita"
            "Anousheh"
            "Arezu"
            "Ashraf"
            "Astar"
            "Atoosa"
            "Azar"
            "Azadeh"
            "Banu"
            "Baharak"
            "Farnaz"
            "Farnzaneh"
            "Fatemeh"
            "Fereshteh"
            "Goli"
            "Jaleh"
            "Katayoun"
            "Kiana"
            "Khorshid"
            "Laleh"
            "Leila"
            "Mandana"
            "Mahshid"
            "Maryam"
            "Mehregan"
            "Mina"
            "Mithra"
            "Mojugan"
            "Nasrin"
            "Nazanin"
            "Niloufar"
            "Parastu"
            "Pardis"
            "Parisa"
            "Parvin"
            "Payvand"
            "Reyhan"
            "Roksaneh"
            "Roya"
            "Roxana"
            "Sepideh"
            "Shirin"
            "Simin"
            "Soraya"
            "Sheila"
            "Sahar"
            "Tahmineh"
            "Taraneh"
            "Tarsa"
            "Tannaz"
            "Yasmin"
            "Yasamin"
            "Zarine"
            "Zhila"
            "Zaynab"]
   :surname ["Basha"
             "Dumein"
             "Jassan"
             "Khalid"
             "Mostana"
             "Pashar"
             "Rein"
             "Abbasi"
             "Abed"
             "Ahura"
             "Ardavan"
             "Aria"
             "Armand"
             "Avesta"
             "Esfahani"
             "Esfandiari"
             "Farrokhzad"
             "Farahmand"
             "Ghorbani"
             "Gul"
             "Hanifnejad"
             "Hashemi"
             "Homayoun"
             "Hooshang"
             "Jahandar"
             "Jahangir"
             "Jahanshah"
             "Jamshidi"
             "Jang-Ju"
             "Kavoosi"
             "Kazemi"
             "Khadem"
             "Khiabani"
             "Khorasani"
             "Khorram-Din"
             "Lajani"
             "Lahijani"
             "Madani"
             "Mazdaki"
             "Mazdani"
             "Mehregan"
             "Mazandarani"
             "Mokri"
             "Mohsen"
             "Pahlavi"
             "Paria"
             "Parsi"
             "Pouran"
             "Rahbar"
             "Rajavi"
             "Rezaei"
             "Rostamian"
             "Sassani"
             "Shamshiri"
             "Shir-Del"
             "Shirazi"
             "Teymouri"
             "Tir"
             "Turan"
             "Turani"]})

(def chondathan-names
  {:male ["Darvin"
          "Dorn"
          "Evendur"
          "Gorstag"
          "Grim"
          "Helm"
          "Malark"
          "Morn"
          "Mirt"
          "Morn"
          "Kirt"
          "Mort"
          "Randal"
          "Stedd"
          "Reed"]
   :female ["Arveene"
            "Esvele"
            "Jhessail"
            "Kerri"
            "Lureene"
            "Miri"
            "Niri"
            "Rowan"
            "Shandri"
            "Shandra"
            "Tessele"]
   :surname-pre ["Amble"
                 "Buck"
                 "Dun"
                 "Even"
                 "Grey"
                 "Tall"
                 "Red"
                 "Green"
                 "Gold"
                 "Silver"
                 "High"]
   :surname-post ["crown"
                 "man"
                 "dragon"
                 "wood"
                 "castle"
                  "stag"]})

(def turami-names
  {:male ["Anton"
          "Diero"
          "Marcon"
          "Pieron"
          "Rimardo"
          "Romero"
          "Salazar"
          "Umbero"]
   :male-pre ["An"
              "Pie"
              "Ri"
              "Sala"
              "Mar"
              "Die"
              "Ba"
              "Ab"
              "Bar"]
   :male-post ["ro"
               "dol"
               "tol"
               "ron"
               "con"
               "bero"
               "zar"
               "mardo"
               "kar"]
   :female ["Balama"
            "Dona"
            "Faila"
            "Jalana"
            "Luisa"
            "Marta"
            "Quara"
            "Selise"
            "Vonda"]
   :female-pre ["Do"
                "Bala"
                "Aba"
                "Qua"
                "Seli"
                "Von"
                "Lui"
                "Ara"
                "Bibi"]
   :female-post ["da"
                 "na"
                 "sa"
                 "ma"
                 "se"
                 "rne"
                 "ne"]
   :surname ["Agosto"
             "Astorio"
             "Calabra"
             "Domine"
             "Falone"
             "Marivaldi"
             "Pisacar"
             "Ramondo"
             "Aroztegi"
             "Bidarte"
             "Bolibar"
             "Elkano"
             "Elizondo"
             "Etxandi"
             "Etxarte"
             "Etxeberri"
             "Ibarra"
             "Lekubarri"
             "Loiola"
             "Mendiluze"
             "Urberoaga"
             "Zabala"
             "Zubiondo"
             "Eneko"]
   :surname-pre ["Mari"
                 "Asta"
                 "Asto"
                 "Do"
                 "Cala"
                 "Pisa"
                 "I"
                 "Za"]
   :surname-post ["buri"
                  "buru"
                  "lando"
                  "mondo"
                  "car"
                  "rte"
                  "neko"
                  "gorri"
                  "turri"
                  "luze"
                  "bala"
                  "kano"
                  "xarte"
                  "zondo"
                  "barri"]})

(def shou-names
  {:male ["An"
          "Chen"
          "Chi"
          "Fai"
          "Jiang"
          "Jun"
          "Lian"
          "Long"
          "Meng"
          "On"
          "Shan"
          "Shui"
          "Wen"
          "Li"
          "Ling"
          "Sheng"
          "Si"
          "Song"
          "Zhao"]
   :pre ["Ji"
         "Xi"
         "J"
         "M"
         "Ch"
         "Chi"
         "Sh"
         "Shi"
         "L"
         "Li"
         "F"
         "Fi"]
   :post ["ang"
          "an"
          "eng"
          "ong"
          "en"
          "on"]
   :surname ["Chien"
             "Huang"
             "Kao"
             "Kung"
             "Lao"
             "Ling"
             "Mei"
             "Pin"
             "Shin"
             "Sum"
             "Tan"
             "Wan"
             "Wu"
             "Kong"
             "Ma"
             "Cheng"
             "Tan"
             "He"
             "Hu"
             "Mao"]
   :female ["Bai"
            "Chao"
            "Jia"
            "Lie"
            "Mei"
            "Qiao"
            "Shui"
            "Tai"
            "Fen"
            "Fan"
            "Hui"
            "Ju"
            "Jun"
            "Lan"
            "Lei"
            "Liling"
            "Min"
            "Liu"
            "Nuo"
            "Shu"
            "Qiu"
            "Ting"
            "Wei"
            "Wen"]})

(defn name-search-match [text]
  (re-matches #".*\bname\b.*" text))

(defn first-last [list sex]
  (str (-> list sex rand-nth)
       " "
       (-> list :surname rand-nth)))

(defn join-names [first last]
  (str first " " last))

(defn random-item [list key]
  (-> list key rand-nth))

(defn random-sex []
  (rand-nth [:male :female]))

(defmulti random-name (fn [{:keys [race subrace sex]}]
                        (prn "RANDOM NAME" race subrace sex)
                        [(or subrace race) sex]))

(defmethod random-name [:calishite :male] [_]
  (first-last calishite-names :male))

(defmethod random-name [:calishite :female] [_]
  (first-last calishite-names :female))

(defmethod random-name [:calishite nil] [_]
  (first-last calishite-names (random-sex)))

(defn chondathan-surname []
  (str (random-item chondathan-names :surname-pre)
       (random-item chondathan-names :surname-post)))

(defn chondathan-male-name []
  (str (random-item chondathan-names :male-pre)
       (random-item chondathan-names :male-post)))

(defmethod random-name [:chondathan :male] [_]
  (join-names
   (random-item chondathan-names :male)
   (chondathan-surname)))

(defmethod random-name [:chondathan :female] [_]
  (join-names
   (random-item chondathan-names :female)
   (chondathan-surname)))

(defmethod random-name [:chondathan nil] [_]
  (join-names
   (random-item chondathan-names (random-sex))
   (chondathan-surname)))

(defn set-name [list type]
  (random-item list type))

(defn combined-name [list pre-type post-type]
  (str (random-item list pre-type)
       (random-item list post-type)))

(defn random-set-or-combined [list type pre-type post-type]
  (rand-nth [(set-name list type) (combined-name list pre-type post-type)]))

(defmethod random-name [:turami :male] [_]
  (join-names
   (random-set-or-combined turami-names :male :male-pre :male-post)
   (random-set-or-combined turami-names :surname :surname-pre :surname-post)))

(defmethod random-name [:turami :female] [_]
  (join-names
   (random-set-or-combined turami-names :female :female-pre :female-post)
   (random-set-or-combined turami-names :surname :surname-pre :surname-post)))

(defmethod random-name [:turami nil] [_]
  (join-names
   (apply random-set-or-combined turami-names
          (rand-nth [[:female :female-pre :female-post]
                     [:male :male-pre :male-post]]))
   (random-set-or-combined turami-names :surname :surname-pre :surname-post)))

(defmethod random-name [:shou :male] [_]
  (join-names
   (random-set-or-combined shou-names :male :pre :post)
   (random-set-or-combined shou-names :surname :pre :post)))

(defmethod random-name [:shou :female] [_]
  (join-names
   (random-set-or-combined shou-names :female :pre :post)
   (random-set-or-combined shou-names :surname :pre :post)))

(defmethod random-name [:shou nil] [_]
  (join-names
   (random-set-or-combined shou-names (random-sex) :pre :post)
   (random-set-or-combined shou-names :surname :pre :post)))

(defmethod random-name [nil nil] [_]
  (random-name {:race :human
                :subrace :chondathan}))

(defmethod random-name [nil :male] [_]
  (random-name {:race :human
                :subrace :chondathan
                :sex :male}))

(defmethod random-name [nil :female] [_]
  (random-name {:race :human
                :subrace :chondathan
                :sex :female}))

(defmethod random-name :default [_]
  (random-name {:race :human}))