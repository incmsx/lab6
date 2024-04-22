package Fillers;

import java.util.HashSet;

public class KeyGenerator
{
    private static HashSet<Long> usedKeys = new HashSet<>();
    private static Long keyCounter = 0L;
    public static Long generateKey()
    {
        Long key = keyCounter;
        if (usedKeys.contains(key))
        {
            keyCounter++;
            getUsedKeys();
        }
        usedKeys.add(key);

        keyCounter++;

        return key;
    }

    public static HashSet<Long> getUsedKeys()
    {
        return usedKeys;
    }

    public static void addUsedKey(Long key)
    {
        usedKeys.add(key);
    }
}
