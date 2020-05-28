class A {
    void testSwitch1() {
        int i = 0;
        switch(i) { // Noncompliant {{switch关键词之后必须有一个空格}}
            // 范德萨
        }

        switch  (i) { // Noncompliant {{switch关键词之后必须有一个空格}}
            // 范德萨
        }

        switch (i) {
            // 范德萨
        }
    }

    void testFor1() {
        int i = 0;
        for(;;) { // Noncompliant {{for关键词之后必须有一个空格}}
            // 范德萨
        }
        for (;;) {
            // 范德萨
        }
    }

    void testIf() {
        int i = 0;
        if(i < 10) { // Noncompliant {{if关键词之后必须有一个空格}}
            // 范德萨
        }
        if  // Noncompliant {{if关键词之后必须有一个空格}}
        (i < 10) {
            // 范德萨
        }
        if (i < 10) {
            // 范德萨
        }
    }

    void testElse() {
        int i = 0;
        if (i < 10) {
            // 范德萨
        } else {
            // fdsafd
        }

        if (i < 10) {
            // 范德萨
        } else{ // Noncompliant {{else关键词之后必须有一个空格}}
            // fdsafd
        }
    }

    void testDo() {
        int i = 0;
        do  {   // Noncompliant {{do关键词之后必须有一个空格}}
            i++;
        } while(i < 10);

        do{          // Noncompliant {{do关键词之后必须有一个空格}}
            i++;
        } while (i < 10);

        do {
            i++;
        } while (i < 10);
    }



}