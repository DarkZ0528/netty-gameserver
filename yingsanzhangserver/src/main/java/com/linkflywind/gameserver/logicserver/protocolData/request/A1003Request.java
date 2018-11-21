package com.linkflywind.gameserver.logicserver.protocolData.request;


import com.linkflywind.gameserver.core.annotation.Protocol;
import com.linkflywind.gameserver.core.room.message.baseMessage.GameInitMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Protocol(1003)
public class A1003Request extends GameInitMessage {
    private int playerLowerlimit;
    private int playerUpLimit;
    private  int xiaZhuTop;
    private int juShu;
}