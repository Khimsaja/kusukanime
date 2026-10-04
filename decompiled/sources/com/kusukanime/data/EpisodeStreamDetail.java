package com.kusukanime.data;

import G3.k;
import P3.q;
import P3.y;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import v.c0;
import z1.c;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\""}, d2 = {"Lcom/kusukanime/data/EpisodeStreamDetail;", "", "episode", "", LinkHeader.Parameters.Title, "streams", "", "Lcom/kusukanime/data/StreamItem;", "qualities", "servers", "Lcom/kusukanime/data/ServerGroup;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEpisode", "()Ljava/lang/String;", "getTitle", "getStreams", "()Ljava/util/List;", "getQualities", "getServers", "qualityOptions", "getQualityOptions", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class EpisodeStreamDetail {
    public static final int $stable = 8;
    private final String episode;
    private final List<StreamItem> qualities;
    private final transient List<StreamItem> qualityOptions;
    private final List<ServerGroup> servers;
    private final List<StreamItem> streams;
    private final String title;

    public EpisodeStreamDetail(String str, String str2, List<StreamItem> list, List<StreamItem> list2, List<ServerGroup> list3) {
        Object next;
        l.f("episode", str);
        l.f(LinkHeader.Parameters.Title, str2);
        l.f("streams", list);
        l.f("qualities", list2);
        l.f("servers", list3);
        this.episode = str;
        this.title = str2;
        this.streams = list;
        this.qualities = list2;
        this.servers = list3;
        if (list2.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String resolution = ((StreamItem) obj).getResolution();
                resolution = AbstractC2510o.g0(resolution) ? "unknown" : resolution;
                Object arrayList = linkedHashMap.get(resolution);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(resolution, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List list4 = (List) ((Map.Entry) it.next()).getValue();
                Iterator it2 = list4.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((StreamItem) next).is_raw()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                StreamItem streamItem = (StreamItem) next;
                if (streamItem == null) {
                    streamItem = (StreamItem) q.r0(list4);
                }
                arrayList2.add(streamItem);
            }
            list2 = q.O0(arrayList2, new Comparator() { // from class: com.kusukanime.data.EpisodeStreamDetail$qualityOptions$lambda$0$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t7, T t8) {
                    String resolution2 = ((StreamItem) t8).getResolution();
                    int length = resolution2.length();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            break;
                        }
                        if (!Character.isDigit(resolution2.charAt(i7))) {
                            resolution2 = resolution2.substring(0, i7);
                            l.e("substring(...)", resolution2);
                            break;
                        }
                        i7++;
                    }
                    Integer numU = AbstractC2517v.U(resolution2);
                    Integer numValueOf = Integer.valueOf(numU != null ? numU.intValue() : 0);
                    String resolution3 = ((StreamItem) t7).getResolution();
                    int length2 = resolution3.length();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            break;
                        }
                        if (!Character.isDigit(resolution3.charAt(i8))) {
                            resolution3 = resolution3.substring(0, i8);
                            l.e("substring(...)", resolution3);
                            break;
                        }
                        i8++;
                    }
                    Integer numU2 = AbstractC2517v.U(resolution3);
                    return c.h(numValueOf, Integer.valueOf(numU2 != null ? numU2.intValue() : 0));
                }
            });
        }
        this.qualityOptions = list2;
    }

    public static /* synthetic */ EpisodeStreamDetail copy$default(EpisodeStreamDetail episodeStreamDetail, String str, String str2, List list, List list2, List list3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = episodeStreamDetail.episode;
        }
        if ((i7 & 2) != 0) {
            str2 = episodeStreamDetail.title;
        }
        if ((i7 & 4) != 0) {
            list = episodeStreamDetail.streams;
        }
        if ((i7 & 8) != 0) {
            list2 = episodeStreamDetail.qualities;
        }
        if ((i7 & 16) != 0) {
            list3 = episodeStreamDetail.servers;
        }
        List list4 = list3;
        List list5 = list;
        return episodeStreamDetail.copy(str, str2, list5, list2, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEpisode() {
        return this.episode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<StreamItem> component3() {
        return this.streams;
    }

    public final List<StreamItem> component4() {
        return this.qualities;
    }

    public final List<ServerGroup> component5() {
        return this.servers;
    }

    public final EpisodeStreamDetail copy(String episode, String title, List<StreamItem> streams, List<StreamItem> qualities, List<ServerGroup> servers) {
        l.f("episode", episode);
        l.f(LinkHeader.Parameters.Title, title);
        l.f("streams", streams);
        l.f("qualities", qualities);
        l.f("servers", servers);
        return new EpisodeStreamDetail(episode, title, streams, qualities, servers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EpisodeStreamDetail)) {
            return false;
        }
        EpisodeStreamDetail episodeStreamDetail = (EpisodeStreamDetail) other;
        return l.a(this.episode, episodeStreamDetail.episode) && l.a(this.title, episodeStreamDetail.title) && l.a(this.streams, episodeStreamDetail.streams) && l.a(this.qualities, episodeStreamDetail.qualities) && l.a(this.servers, episodeStreamDetail.servers);
    }

    public final String getEpisode() {
        return this.episode;
    }

    public final List<StreamItem> getQualities() {
        return this.qualities;
    }

    public final List<StreamItem> getQualityOptions() {
        return this.qualityOptions;
    }

    public final List<ServerGroup> getServers() {
        return this.servers;
    }

    public final List<StreamItem> getStreams() {
        return this.streams;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.servers.hashCode() + ((this.qualities.hashCode() + ((this.streams.hashCode() + A6.b.b(this.title, this.episode.hashCode() * 31, 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.episode;
        String str2 = this.title;
        List<StreamItem> list = this.streams;
        List<StreamItem> list2 = this.qualities;
        List<ServerGroup> list3 = this.servers;
        StringBuilder sbC = c0.c("EpisodeStreamDetail(episode=", str, ", title=", str2, ", streams=");
        sbC.append(list);
        sbC.append(", qualities=");
        sbC.append(list2);
        sbC.append(", servers=");
        sbC.append(list3);
        sbC.append(")");
        return sbC.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EpisodeStreamDetail(String str, String str2, List list, List list2, List list3, int i7, f fVar) {
        int i8 = i7 & 4;
        y yVar = y.f7779k;
        this(str, str2, i8 != 0 ? yVar : list, (i7 & 8) != 0 ? yVar : list2, (i7 & 16) != 0 ? yVar : list3);
    }
}
