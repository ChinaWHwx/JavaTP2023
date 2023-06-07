package Clonage;

enum Grade {
    TROOPER {
        public String getMarque() { return "WHITE"; }
    },
    SERGENT {
        public String getMarque() { return "GREEN"; }
    },
    LIEUTENANT {
        public String getMarque() { return "BLUE"; }
    },
    CAPITAINE {
        public String getMarque() { return "RED"; }
    },
    COMMANDEUR {
        public String getMarque() { return "YELLOW"; }
    };

    abstract public String getMarque();
}
