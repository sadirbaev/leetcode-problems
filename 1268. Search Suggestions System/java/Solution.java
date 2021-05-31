class Solution {
  public List < List < String >> suggestedProducts(String[] products, String searchWord) {
    Arrays.sort(products);
    List < String > productList = new ArrayList < > (Arrays.asList(products));
    List < List < String >> res = new ArrayList < > ();
    for (int i = 1; i <= searchWord.length(); i++) {
      List < String > subRes = new ArrayList < > ();
      String subStr = searchWord.substring(0, i);
      for (int j = 0; j < productList.size(); j++) {
        if (productList.get(j).startsWith(subStr)) {
          subRes.add(productList.get(j));
        } else {
          productList.remove(j);
          j--;
        }
        if (subRes.size() == 3) break;
      }
      res.add(subRes);
    }
    return res;
  }
}