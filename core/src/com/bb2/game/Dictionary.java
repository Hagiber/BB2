package com.bb2.game;

import com.badlogic.gdx.utils.ObjectMap;

public class Dictionary
{
    public enum Keys
    {
        KeyHello,
        KeyRain
    }
    public ObjectMap <String, String> map;
    public Dictionary (){}
    public String getValue(Keys key)
    {
        return map.get(key.name());
    }
}
