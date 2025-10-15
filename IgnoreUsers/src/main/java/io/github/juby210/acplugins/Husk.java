package io.github.juby210.acplugins;

import com.discord.api.channel.Channel;
import com.discord.api.role.GuildRole;
import com.discord.api.user.User;
import com.discord.api.utcdatetime.UtcDateTime;
import com.discord.models.member.GuildMember;
import com.discord.models.message.Message;
import com.discord.utilities.embed.InviteEmbedModel;
import com.discord.widgets.botuikit.ComponentChatListState;
import com.discord.widgets.chat.list.entries.ChatListEntry;
import com.discord.widgets.chat.list.model.WidgetChatListModelMessages;
import d0.t.n;
import d0.t.t;
import d0.t.u;
import d0.z.d.m;
import d0.z.d.o;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function14;

import com.discord.widgets.chat.list.model.WidgetChatListModelMessages$Companion$get$1;
import com.aliucord.api.PatcherAPI;
import com.aliucord.patcher.InsteadHook;

public class Husk{
	Husk(PatcherAPI patcher, List<String> ignoredUsers){
		try{patcher.patch(WidgetChatListModelMessages$Companion$get$1.class.getDeclaredMethod("invoke", WidgetChatListModelMessages.MessagesWithMetadata.class, Channel.class, Map.class, List.class, Map.class, Long.class, Map.class, Long.class, boolean.class, boolean.class, boolean.class, long.class, Map.class, InviteEmbedModel.class, boolean.class),
			InsteadHook.DO_NOTHING
		);}catch(Exception e){};
	}
}
