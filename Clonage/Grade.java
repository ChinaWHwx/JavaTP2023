package Clonage;

enum Grade {
    TROOPER {//士兵
        public String getMarque() { return "WHITE"; }
    },
    SERGENT {//中士
        public String getMarque() { return "GREEN"; }
    },
    LIEUTENANT {//中尉
        public String getMarque() { return "BLUE"; }
    },
    CAPITAINE {//上尉
        public String getMarque() { return "RED"; }
    },
    COMMANDEUR {//上校
        public String getMarque() { return "YELLOW"; }
    };

    abstract public String getMarque();
}
