public class Tools {

    public int[] inverseTab(int[] tab) {
        int[] newTab = new int[tab.length];
        for(int i = 0; i < tab.length; i++) {
            newTab[i] = tab[tab.length - 1 - i];
        }
        return newTab;
    }
}