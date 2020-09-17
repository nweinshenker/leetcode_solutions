class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap();
        List<String> results = new ArrayList<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String [] array = cpdomains[i].split(" ");
            
            int count = Integer.parseInt(array[0], 10);
            String [] subdomains = array[1].split("\\.");
            
            String lowDomain = "";
            for (int j = subdomains.length - 1; j >= 0; j--) {
                if (j == subdomains.length - 1) {
                    lowDomain = subdomains[j] + lowDomain;
                } else {
                    lowDomain = subdomains[j] + "." + lowDomain;
                }
                map.put(lowDomain, map.getOrDefault(lowDomain, 0) + count);
            }
        }
        
        
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            results.add(String.valueOf(entry.getValue()) + " " + entry.getKey());
        }

        return results;
    }
}