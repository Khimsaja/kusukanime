package com.kusukanime.data;

import V5.i;
import Z5.o0;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import v.c0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u000eHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u00062"}, d2 = {"Lcom/kusukanime/data/HistoryRow;", "", "id", "", "user_id", "anime_slug", "episode_slug", "position_ms", "", "duration_ms", "updated_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getUser_id", "getAnime_slug", "getEpisode_slug", "getPosition_ms", "()J", "getDuration_ms", "getUpdated_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class HistoryRow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String anime_slug;
    private final long duration_ms;
    private final String episode_slug;
    private final String id;
    private final long position_ms;
    private final String updated_at;
    private final String user_id;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/kusukanime/data/HistoryRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/kusukanime/data/HistoryRow;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return HistoryRow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HistoryRow() {
        this((String) null, (String) null, (String) null, (String) null, 0L, 0L, (String) null, 127, (f) null);
    }

    public static /* synthetic */ HistoryRow copy$default(HistoryRow historyRow, String str, String str2, String str3, String str4, long j7, long j8, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = historyRow.id;
        }
        if ((i7 & 2) != 0) {
            str2 = historyRow.user_id;
        }
        if ((i7 & 4) != 0) {
            str3 = historyRow.anime_slug;
        }
        if ((i7 & 8) != 0) {
            str4 = historyRow.episode_slug;
        }
        if ((i7 & 16) != 0) {
            j7 = historyRow.position_ms;
        }
        if ((i7 & 32) != 0) {
            j8 = historyRow.duration_ms;
        }
        if ((i7 & 64) != 0) {
            str5 = historyRow.updated_at;
        }
        String str6 = str5;
        long j9 = j8;
        long j10 = j7;
        return historyRow.copy(str, str2, str3, str4, j10, j9, str6);
    }

    public static final /* synthetic */ void write$Self$app_release(HistoryRow historyRow, Y5.b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || !l.a(historyRow.id, "")) {
            bVar.E(serialDescriptor, 0, historyRow.id);
        }
        if (bVar.z(serialDescriptor) || !l.a(historyRow.user_id, "")) {
            bVar.E(serialDescriptor, 1, historyRow.user_id);
        }
        if (bVar.z(serialDescriptor) || !l.a(historyRow.anime_slug, "")) {
            bVar.E(serialDescriptor, 2, historyRow.anime_slug);
        }
        if (bVar.z(serialDescriptor) || !l.a(historyRow.episode_slug, "")) {
            bVar.E(serialDescriptor, 3, historyRow.episode_slug);
        }
        if (bVar.z(serialDescriptor) || historyRow.position_ms != 0) {
            bVar.x(serialDescriptor, 4, historyRow.position_ms);
        }
        if (bVar.z(serialDescriptor) || historyRow.duration_ms != 0) {
            bVar.x(serialDescriptor, 5, historyRow.duration_ms);
        }
        if (!bVar.z(serialDescriptor) && l.a(historyRow.updated_at, "")) {
            return;
        }
        bVar.E(serialDescriptor, 6, historyRow.updated_at);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAnime_slug() {
        return this.anime_slug;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEpisode_slug() {
        return this.episode_slug;
    }

    /* renamed from: component5, reason: from getter */
    public final long getPosition_ms() {
        return this.position_ms;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final HistoryRow copy(String id, String user_id, String anime_slug, String episode_slug, long position_ms, long duration_ms, String updated_at) {
        l.f("id", id);
        l.f("user_id", user_id);
        l.f("anime_slug", anime_slug);
        l.f("episode_slug", episode_slug);
        l.f("updated_at", updated_at);
        return new HistoryRow(id, user_id, anime_slug, episode_slug, position_ms, duration_ms, updated_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryRow)) {
            return false;
        }
        HistoryRow historyRow = (HistoryRow) other;
        return l.a(this.id, historyRow.id) && l.a(this.user_id, historyRow.user_id) && l.a(this.anime_slug, historyRow.anime_slug) && l.a(this.episode_slug, historyRow.episode_slug) && this.position_ms == historyRow.position_ms && this.duration_ms == historyRow.duration_ms && l.a(this.updated_at, historyRow.updated_at);
    }

    public final String getAnime_slug() {
        return this.anime_slug;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final String getEpisode_slug() {
        return this.episode_slug;
    }

    public final String getId() {
        return this.id;
    }

    public final long getPosition_ms() {
        return this.position_ms;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return this.updated_at.hashCode() + AbstractC0703b.c(AbstractC0703b.c(A6.b.b(this.episode_slug, A6.b.b(this.anime_slug, A6.b.b(this.user_id, this.id.hashCode() * 31, 31), 31), 31), 31, this.position_ms), 31, this.duration_ms);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.user_id;
        String str3 = this.anime_slug;
        String str4 = this.episode_slug;
        long j7 = this.position_ms;
        long j8 = this.duration_ms;
        String str5 = this.updated_at;
        StringBuilder sbC = c0.c("HistoryRow(id=", str, ", user_id=", str2, ", anime_slug=");
        sbC.append(str3);
        sbC.append(", episode_slug=");
        sbC.append(str4);
        sbC.append(", position_ms=");
        sbC.append(j7);
        sbC.append(", duration_ms=");
        sbC.append(j8);
        sbC.append(", updated_at=");
        return AbstractC0703b.m(sbC, str5, ")");
    }

    public /* synthetic */ HistoryRow(int i7, String str, String str2, String str3, String str4, long j7, long j8, String str5, o0 o0Var) {
        if ((i7 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i7 & 2) == 0) {
            this.user_id = "";
        } else {
            this.user_id = str2;
        }
        if ((i7 & 4) == 0) {
            this.anime_slug = "";
        } else {
            this.anime_slug = str3;
        }
        if ((i7 & 8) == 0) {
            this.episode_slug = "";
        } else {
            this.episode_slug = str4;
        }
        if ((i7 & 16) == 0) {
            this.position_ms = 0L;
        } else {
            this.position_ms = j7;
        }
        if ((i7 & 32) == 0) {
            this.duration_ms = 0L;
        } else {
            this.duration_ms = j8;
        }
        if ((i7 & 64) == 0) {
            this.updated_at = "";
        } else {
            this.updated_at = str5;
        }
    }

    public HistoryRow(String str, String str2, String str3, String str4, long j7, long j8, String str5) {
        l.f("id", str);
        l.f("user_id", str2);
        l.f("anime_slug", str3);
        l.f("episode_slug", str4);
        l.f("updated_at", str5);
        this.id = str;
        this.user_id = str2;
        this.anime_slug = str3;
        this.episode_slug = str4;
        this.position_ms = j7;
        this.duration_ms = j8;
        this.updated_at = str5;
    }

    public /* synthetic */ HistoryRow(String str, String str2, String str3, String str4, long j7, long j8, String str5, int i7, f fVar) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4, (i7 & 16) != 0 ? 0L : j7, (i7 & 32) != 0 ? 0L : j8, (i7 & 64) != 0 ? "" : str5);
    }
}
