package com.kusukanime.data;

import V5.i;
import Z5.o0;
import Z5.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import v.c0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000234B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J_\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000fHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00065"}, d2 = {"Lcom/kusukanime/data/CommentRow;", "", "id", "", "user_id", "anime_slug", "episode_slug", "content", "created_at", "parent_comment_id", "users", "Lcom/kusukanime/data/UserMini;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kusukanime/data/UserMini;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kusukanime/data/UserMini;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getUser_id", "getAnime_slug", "getEpisode_slug", "getContent", "getCreated_at", "getParent_comment_id", "getUsers", "()Lcom/kusukanime/data/UserMini;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class CommentRow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String anime_slug;
    private final String content;
    private final String created_at;
    private final String episode_slug;
    private final String id;
    private final String parent_comment_id;
    private final String user_id;
    private final UserMini users;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/kusukanime/data/CommentRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/kusukanime/data/CommentRow;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return CommentRow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CommentRow() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (UserMini) null, 255, (f) null);
    }

    public static /* synthetic */ CommentRow copy$default(CommentRow commentRow, String str, String str2, String str3, String str4, String str5, String str6, String str7, UserMini userMini, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = commentRow.id;
        }
        if ((i7 & 2) != 0) {
            str2 = commentRow.user_id;
        }
        if ((i7 & 4) != 0) {
            str3 = commentRow.anime_slug;
        }
        if ((i7 & 8) != 0) {
            str4 = commentRow.episode_slug;
        }
        if ((i7 & 16) != 0) {
            str5 = commentRow.content;
        }
        if ((i7 & 32) != 0) {
            str6 = commentRow.created_at;
        }
        if ((i7 & 64) != 0) {
            str7 = commentRow.parent_comment_id;
        }
        if ((i7 & 128) != 0) {
            userMini = commentRow.users;
        }
        String str8 = str7;
        UserMini userMini2 = userMini;
        String str9 = str5;
        String str10 = str6;
        return commentRow.copy(str, str2, str3, str4, str9, str10, str8, userMini2);
    }

    public static final /* synthetic */ void write$Self$app_release(CommentRow commentRow, Y5.b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || !l.a(commentRow.id, "")) {
            bVar.E(serialDescriptor, 0, commentRow.id);
        }
        if (bVar.z(serialDescriptor) || !l.a(commentRow.user_id, "")) {
            bVar.E(serialDescriptor, 1, commentRow.user_id);
        }
        if (bVar.z(serialDescriptor) || !l.a(commentRow.anime_slug, "")) {
            bVar.E(serialDescriptor, 2, commentRow.anime_slug);
        }
        if (bVar.z(serialDescriptor) || commentRow.episode_slug != null) {
            bVar.F(serialDescriptor, 3, t0.a, commentRow.episode_slug);
        }
        if (bVar.z(serialDescriptor) || !l.a(commentRow.content, "")) {
            bVar.E(serialDescriptor, 4, commentRow.content);
        }
        if (bVar.z(serialDescriptor) || !l.a(commentRow.created_at, "")) {
            bVar.E(serialDescriptor, 5, commentRow.created_at);
        }
        if (bVar.z(serialDescriptor) || commentRow.parent_comment_id != null) {
            bVar.F(serialDescriptor, 6, t0.a, commentRow.parent_comment_id);
        }
        if (!bVar.z(serialDescriptor) && commentRow.users == null) {
            return;
        }
        bVar.F(serialDescriptor, 7, UserMini$$serializer.INSTANCE, commentRow.users);
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
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component7, reason: from getter */
    public final String getParent_comment_id() {
        return this.parent_comment_id;
    }

    /* renamed from: component8, reason: from getter */
    public final UserMini getUsers() {
        return this.users;
    }

    public final CommentRow copy(String id, String user_id, String anime_slug, String episode_slug, String content, String created_at, String parent_comment_id, UserMini users) {
        l.f("id", id);
        l.f("user_id", user_id);
        l.f("anime_slug", anime_slug);
        l.f("content", content);
        l.f("created_at", created_at);
        return new CommentRow(id, user_id, anime_slug, episode_slug, content, created_at, parent_comment_id, users);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentRow)) {
            return false;
        }
        CommentRow commentRow = (CommentRow) other;
        return l.a(this.id, commentRow.id) && l.a(this.user_id, commentRow.user_id) && l.a(this.anime_slug, commentRow.anime_slug) && l.a(this.episode_slug, commentRow.episode_slug) && l.a(this.content, commentRow.content) && l.a(this.created_at, commentRow.created_at) && l.a(this.parent_comment_id, commentRow.parent_comment_id) && l.a(this.users, commentRow.users);
    }

    public final String getAnime_slug() {
        return this.anime_slug;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getEpisode_slug() {
        return this.episode_slug;
    }

    public final String getId() {
        return this.id;
    }

    public final String getParent_comment_id() {
        return this.parent_comment_id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final UserMini getUsers() {
        return this.users;
    }

    public int hashCode() {
        int iB = A6.b.b(this.anime_slug, A6.b.b(this.user_id, this.id.hashCode() * 31, 31), 31);
        String str = this.episode_slug;
        int iB2 = A6.b.b(this.created_at, A6.b.b(this.content, (iB + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.parent_comment_id;
        int iHashCode = (iB2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserMini userMini = this.users;
        return iHashCode + (userMini != null ? userMini.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.user_id;
        String str3 = this.anime_slug;
        String str4 = this.episode_slug;
        String str5 = this.content;
        String str6 = this.created_at;
        String str7 = this.parent_comment_id;
        UserMini userMini = this.users;
        StringBuilder sbC = c0.c("CommentRow(id=", str, ", user_id=", str2, ", anime_slug=");
        sbC.append(str3);
        sbC.append(", episode_slug=");
        sbC.append(str4);
        sbC.append(", content=");
        sbC.append(str5);
        sbC.append(", created_at=");
        sbC.append(str6);
        sbC.append(", parent_comment_id=");
        sbC.append(str7);
        sbC.append(", users=");
        sbC.append(userMini);
        sbC.append(")");
        return sbC.toString();
    }

    public /* synthetic */ CommentRow(int i7, String str, String str2, String str3, String str4, String str5, String str6, String str7, UserMini userMini, o0 o0Var) {
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
            this.episode_slug = null;
        } else {
            this.episode_slug = str4;
        }
        if ((i7 & 16) == 0) {
            this.content = "";
        } else {
            this.content = str5;
        }
        if ((i7 & 32) == 0) {
            this.created_at = "";
        } else {
            this.created_at = str6;
        }
        if ((i7 & 64) == 0) {
            this.parent_comment_id = null;
        } else {
            this.parent_comment_id = str7;
        }
        if ((i7 & 128) == 0) {
            this.users = null;
        } else {
            this.users = userMini;
        }
    }

    public CommentRow(String str, String str2, String str3, String str4, String str5, String str6, String str7, UserMini userMini) {
        l.f("id", str);
        l.f("user_id", str2);
        l.f("anime_slug", str3);
        l.f("content", str5);
        l.f("created_at", str6);
        this.id = str;
        this.user_id = str2;
        this.anime_slug = str3;
        this.episode_slug = str4;
        this.content = str5;
        this.created_at = str6;
        this.parent_comment_id = str7;
        this.users = userMini;
    }

    public /* synthetic */ CommentRow(String str, String str2, String str3, String str4, String str5, String str6, String str7, UserMini userMini, int i7, f fVar) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? "" : str5, (i7 & 32) != 0 ? "" : str6, (i7 & 64) != 0 ? null : str7, (i7 & 128) != 0 ? null : userMini);
    }
}
