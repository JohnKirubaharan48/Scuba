System.out.println("**************Both keys and Values**********");
        Iterator itr =map.entrySet().iterator();
       
        //System.out.println("**************Only keys**********");
        //Iterator itr =map.keySet().iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        map.forEach((k, v) -> {
            System.out.format("key: %d and value: %s", k, v);
            System.out.println();
        });