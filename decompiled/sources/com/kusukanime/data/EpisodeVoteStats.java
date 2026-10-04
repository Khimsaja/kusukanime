package com.kusukanime.data;

import V5.i;
import Z5.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p.AbstractC1755i;
import v.c0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006$"}, d2 = {"Lcom/kusukanime/data/EpisodeVoteStats;", "", "likes", "", "dislikes", "my_vote", "<init>", "(III)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLikes", "()I", "getDislikes", "getMy_vote", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class EpisodeVoteStats {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int dislikes;
    private final int likes;
    private final int my_vote;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/kusukanime/data/EpisodeVoteStats$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/kusukanime/data/EpisodeVoteStats;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return EpisodeVoteStats$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EpisodeVoteStats() {
        this(0, 0, 0, 7, (f) null);
    }

    public static /* synthetic */ EpisodeVoteStats copy$default(EpisodeVoteStats episodeVoteStats, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = episodeVoteStats.likes;
        }
        if ((i10 & 2) != 0) {
            i8 = episodeVoteStats.dislikes;
        }
        if ((i10 & 4) != 0) {
            i9 = episodeVoteStats.my_vote;
        }
        return episodeVoteStats.copy(i7, i8, i9);
    }

    public static final /* synthetic */ void write$Self$app_release(EpisodeVoteStats episodeVoteStats, Y5.b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || episodeVoteStats.likes != 0) {
            bVar.q(0, episodeVoteStats.likes, serialDescriptor);
        }
        if (bVar.z(serialDescriptor) || episodeVoteStats.dislikes != 0) {
            bVar.q(1, episodeVoteStats.dislikes, serialDescriptor);
        }
        if (!bVar.z(serialDescriptor) && episodeVoteStats.my_vote == 0) {
            return;
        }
        bVar.q(2, episodeVoteStats.my_vote, serialDescriptor);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLikes() {
        return this.likes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDislikes() {
        return this.dislikes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMy_vote() {
        return this.my_vote;
    }

    public final EpisodeVoteStats copy(int likes, int dislikes, int my_vote) {
        return new EpisodeVoteStats(likes, dislikes, my_vote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EpisodeVoteStats)) {
            return false;
        }
        EpisodeVoteStats episodeVoteStats = (EpisodeVoteStats) other;
        return this.likes == episodeVoteStats.likes && this.dislikes == episodeVoteStats.dislikes && this.my_vote == episodeVoteStats.my_vote;
    }

    public final int getDislikes() {
        return this.dislikes;
    }

    public final int getLikes() {
        return this.likes;
    }

    public final int getMy_vote() {
        return this.my_vote;
    }

    public int hashCode() {
        return Integer.hashCode(this.my_vote) + AbstractC1755i.a(this.dislikes, Integer.hashCode(this.likes) * 31, 31);
    }

    public String toString() {
        int i7 = this.likes;
        int i8 = this.dislikes;
        int i9 = this.my_vote;
        StringBuilder sbB = c0.b("EpisodeVoteStats(likes=", i7, ", dislikes=", i8, ", my_vote=");
        sbB.append(i9);
        sbB.append(")");
        return sbB.toString();
    }

    public EpisodeVoteStats(int i7, int i8, int i9) {
        this.likes = i7;
        this.dislikes = i8;
        this.my_vote = i9;
    }

    public /* synthetic */ EpisodeVoteStats(int i7, int i8, int i9, int i10, o0 o0Var) {
        if ((i7 & 1) == 0) {
            this.likes = 0;
        } else {
            this.likes = i8;
        }
        if ((i7 & 2) == 0) {
            this.dislikes = 0;
        } else {
            this.dislikes = i9;
        }
        if ((i7 & 4) == 0) {
            this.my_vote = 0;
        } else {
            this.my_vote = i10;
        }
    }

    public /* synthetic */ EpisodeVoteStats(int i7, int i8, int i9, int i10, f fVar) {
        this((i10 & 1) != 0 ? 0 : i7, (i10 & 2) != 0 ? 0 : i8, (i10 & 4) != 0 ? 0 : i9);
    }
}
