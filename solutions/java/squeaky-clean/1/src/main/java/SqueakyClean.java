class SqueakyClean {
    public static String clean(String identifier) {
        String step1 = replaceSpaces(identifier);
        String step2 = kebabToCamelCase(step1);
        String step3 = convertLeetspeak(step2);
        return filterAllowedCharacters(step3);
    }
    
    private static String replaceSpaces(String text) {
        return text.replace(" ", "_");
    }

    private static String kebabToCamelCase(String text){
        char[] textAsArray = text.toCharArray();
        StringBuilder textBuilder = new StringBuilder();
    
        boolean isKebab = false;
        for(int i = 0; i < textAsArray.length; i++) {
            char ch = textAsArray[i];

            if(ch == '-'){
                isKebab = true;
            } else if (isKebab) {
                textBuilder.append(Character.toUpperCase(ch));
                isKebab = false;
            }
            else {
                textBuilder.append(ch);
            }
        }
        return textBuilder.toString();
    }

    private static String convertLeetspeak(String text){
        return text.replace("4", "a").replace("3", "e").replace("0", "o").replace("1", "l").replace("7", "t");
    }

    private static String filterAllowedCharacters(String text){
        char[] textAsArray = text.toCharArray();
        StringBuilder textBuilder = new StringBuilder();
    
        for(int i = 0; i < textAsArray.length; i++) {
            char ch = textAsArray[i];

            if (Character.isISOControl(ch)){
                textBuilder.append("[CTRL]");
            } else if (Character.isDigit(ch) || Character.isLetter(ch) || ch == '_'){
                textBuilder.append(ch);
            }
        }
        return textBuilder.toString();
    }
}
