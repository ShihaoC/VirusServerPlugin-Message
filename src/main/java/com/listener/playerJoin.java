package com.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class playerJoin implements Listener {
    @EventHandler
    public void sendMessage(PlayerJoinEvent event){
        Player player = event.getPlayer();
        LocalDate date = LocalDate.now();
        Map<String, String> info = getInfo(date);
        String mouth = info.get("月");
        String day = info.get("日");
        if(mouth.equals("10") && day.equals("01")){
            player.sendTitle("国庆节快乐","",20,100,20);
        }else {
            player.sendTitle(ChatColor.AQUA +"欢迎"+ChatColor.RED+player.getName()+ ChatColor.AQUA+"进入服务器","/bk可以回到上一个地点",20,100,20);
        }
    }

    public Map<String,String> getInfo(LocalDate date){
        Map<String,String> map = new HashMap<>();
        map.put("月",date.toString().substring(5,7));
        map.put("日",date.toString().substring(8));
        return map;
    }
}
