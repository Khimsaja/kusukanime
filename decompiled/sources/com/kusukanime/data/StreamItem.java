package com.kusukanime.data;

import G3.k;
import P3.z;
import b1.AbstractC0703b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import v.c0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013¨\u0006 "}, d2 = {"Lcom/kusukanime/data/StreamItem;", "", "server", "", "resolution", "url", "headers", "", "is_raw", "", "is_embed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZ)V", "getServer", "()Ljava/lang/String;", "getResolution", "getUrl", "getHeaders", "()Ljava/util/Map;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class StreamItem {
    public static final int $stable = 8;
    private final Map<String, String> headers;
    private final boolean is_embed;
    private final boolean is_raw;
    private final String resolution;
    private final String server;
    private final String url;

    public StreamItem(String str, String str2, String str3, Map<String, String> map, boolean z7, boolean z8) {
        l.f("server", str);
        l.f("resolution", str2);
        l.f("url", str3);
        l.f("headers", map);
        this.server = str;
        this.resolution = str2;
        this.url = str3;
        this.headers = map;
        this.is_raw = z7;
        this.is_embed = z8;
    }

    public static /* synthetic */ StreamItem copy$default(StreamItem streamItem, String str, String str2, String str3, Map map, boolean z7, boolean z8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = streamItem.server;
        }
        if ((i7 & 2) != 0) {
            str2 = streamItem.resolution;
        }
        if ((i7 & 4) != 0) {
            str3 = streamItem.url;
        }
        if ((i7 & 8) != 0) {
            map = streamItem.headers;
        }
        if ((i7 & 16) != 0) {
            z7 = streamItem.is_raw;
        }
        if ((i7 & 32) != 0) {
            z8 = streamItem.is_embed;
        }
        boolean z9 = z7;
        boolean z10 = z8;
        return streamItem.copy(str, str2, str3, map, z9, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServer() {
        return this.server;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResolution() {
        return this.resolution;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> component4() {
        return this.headers;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIs_raw() {
        return this.is_raw;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIs_embed() {
        return this.is_embed;
    }

    public final StreamItem copy(String server, String resolution, String url, Map<String, String> headers, boolean is_raw, boolean is_embed) {
        l.f("server", server);
        l.f("resolution", resolution);
        l.f("url", url);
        l.f("headers", headers);
        return new StreamItem(server, resolution, url, headers, is_raw, is_embed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamItem)) {
            return false;
        }
        StreamItem streamItem = (StreamItem) other;
        return l.a(this.server, streamItem.server) && l.a(this.resolution, streamItem.resolution) && l.a(this.url, streamItem.url) && l.a(this.headers, streamItem.headers) && this.is_raw == streamItem.is_raw && this.is_embed == streamItem.is_embed;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getResolution() {
        return this.resolution;
    }

    public final String getServer() {
        return this.server;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.is_embed) + AbstractC0703b.d((this.headers.hashCode() + A6.b.b(this.url, A6.b.b(this.resolution, this.server.hashCode() * 31, 31), 31)) * 31, 31, this.is_raw);
    }

    public final boolean is_embed() {
        return this.is_embed;
    }

    public final boolean is_raw() {
        return this.is_raw;
    }

    public String toString() {
        String str = this.server;
        String str2 = this.resolution;
        String str3 = this.url;
        Map<String, String> map = this.headers;
        boolean z7 = this.is_raw;
        boolean z8 = this.is_embed;
        StringBuilder sbC = c0.c("StreamItem(server=", str, ", resolution=", str2, ", url=");
        sbC.append(str3);
        sbC.append(", headers=");
        sbC.append(map);
        sbC.append(", is_raw=");
        sbC.append(z7);
        sbC.append(", is_embed=");
        sbC.append(z8);
        sbC.append(")");
        return sbC.toString();
    }

    public /* synthetic */ StreamItem(String str, String str2, String str3, Map map, boolean z7, boolean z8, int i7, f fVar) {
        this(str, str2, str3, (i7 & 8) != 0 ? z.f7780k : map, (i7 & 16) != 0 ? false : z7, (i7 & 32) != 0 ? true : z8);
    }
}
