package com.cprt.model;

public enum JobRole {
    TRAINEE {
        @Override
        public JobRole getNextRole() {
            return JR;
        }
    },
    JR {
        @Override
        public JobRole getNextRole() {
            return PL;
        }
    },
    PL {
        @Override
        public JobRole getNextRole() {
            return SR;
        }
    },
    SR {
        @Override
        public JobRole getNextRole() {
            return ANALYST;
        }
    },
    ANALYST {
        @Override
        public JobRole getNextRole() {
            return SPECIALIST;
        }
    },
    SPECIALIST {
        @Override
        public JobRole getNextRole() {
            return LEADER;
        }
    },
    LEADER {
        @Override
        public JobRole getNextRole() {
            return MANAGER;
        }
    },    
    MANAGER {
        @Override
        public JobRole getNextRole() {
            return MANAGER;
        }
    };

    public abstract JobRole getNextRole();
}
