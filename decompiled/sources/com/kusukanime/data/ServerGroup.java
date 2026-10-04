package com.kusukanime.data;

import G3.k;
import P3.y;
import b1.AbstractC0703b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/kusukanime/data/ServerGroup;", "", "server", "", "direct", "", "qualities", "", "Lcom/kusukanime/data/StreamItem;", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "getServer", "()Ljava/lang/String;", "getDirect", "()Z", "getQualities", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class ServerGroup {
    public static final int $stable = 8;
    private final boolean direct;
    private final List<StreamItem> qualities;
    private final String server;

    public ServerGroup(String str, boolean z7, List<StreamItem> list) {
        l.f("server", str);
        l.f("qualities", list);
        this.server = str;
        this.direct = z7;
        this.qualities = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerGroup copy$default(ServerGroup serverGroup, String str, boolean z7, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = serverGroup.server;
        }
        if ((i7 & 2) != 0) {
            z7 = serverGroup.direct;
        }
        if ((i7 & 4) != 0) {
            list = serverGroup.qualities;
        }
        return serverGroup.copy(str, z7, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServer() {
        return this.server;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDirect() {
        return this.direct;
    }

    public final List<StreamItem> component3() {
        return this.qualities;
    }

    public final ServerGroup copy(String server, boolean direct, List<StreamItem> qualities) {
        l.f("server", server);
        l.f("qualities", qualities);
        return new ServerGroup(server, direct, qualities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerGroup)) {
            return false;
        }
        ServerGroup serverGroup = (ServerGroup) other;
        return l.a(this.server, serverGroup.server) && this.direct == serverGroup.direct && l.a(this.qualities, serverGroup.qualities);
    }

    public final boolean getDirect() {
        return this.direct;
    }

    public final List<StreamItem> getQualities() {
        return this.qualities;
    }

    public final String getServer() {
        return this.server;
    }

    public int hashCode() {
        return this.qualities.hashCode() + AbstractC0703b.d(this.server.hashCode() * 31, 31, this.direct);
    }

    public String toString() {
        return "ServerGroup(server=" + this.server + ", direct=" + this.direct + ", qualities=" + this.qualities + ")";
    }

    public /* synthetic */ ServerGroup(String str, boolean z7, List list, int i7, f fVar) {
        this(str, (i7 & 2) != 0 ? false : z7, (i7 & 4) != 0 ? y.f7779k : list);
    }
}
