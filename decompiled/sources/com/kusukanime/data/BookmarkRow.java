package com.kusukanime.data;

import V5.i;
import Z5.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import v.c0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, d2 = {"Lcom/kusukanime/data/BookmarkRow;", "", "id", "", "user_id", "anime_slug", "created_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getUser_id", "getAnime_slug", "getCreated_at", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class BookmarkRow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String anime_slug;
    private final String created_at;
    private final String id;
    private final String user_id;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/kusukanime/data/BookmarkRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/kusukanime/data/BookmarkRow;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BookmarkRow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BookmarkRow() {
        this((String) null, (String) null, (String) null, (String) null, 15, (f) null);
    }

    public static /* synthetic */ BookmarkRow copy$default(BookmarkRow bookmarkRow, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bookmarkRow.id;
        }
        if ((i7 & 2) != 0) {
            str2 = bookmarkRow.user_id;
        }
        if ((i7 & 4) != 0) {
            str3 = bookmarkRow.anime_slug;
        }
        if ((i7 & 8) != 0) {
            str4 = bookmarkRow.created_at;
        }
        return bookmarkRow.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$app_release(BookmarkRow bookmarkRow, Y5.b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || !l.a(bookmarkRow.id, "")) {
            bVar.E(serialDescriptor, 0, bookmarkRow.id);
        }
        if (bVar.z(serialDescriptor) || !l.a(bookmarkRow.user_id, "")) {
            bVar.E(serialDescriptor, 1, bookmarkRow.user_id);
        }
        if (bVar.z(serialDescriptor) || !l.a(bookmarkRow.anime_slug, "")) {
            bVar.E(serialDescriptor, 2, bookmarkRow.anime_slug);
        }
        if (!bVar.z(serialDescriptor) && l.a(bookmarkRow.created_at, "")) {
            return;
        }
        bVar.E(serialDescriptor, 3, bookmarkRow.created_at);
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
    public final String getCreated_at() {
        return this.created_at;
    }

    public final BookmarkRow copy(String id, String user_id, String anime_slug, String created_at) {
        l.f("id", id);
        l.f("user_id", user_id);
        l.f("anime_slug", anime_slug);
        l.f("created_at", created_at);
        return new BookmarkRow(id, user_id, anime_slug, created_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookmarkRow)) {
            return false;
        }
        BookmarkRow bookmarkRow = (BookmarkRow) other;
        return l.a(this.id, bookmarkRow.id) && l.a(this.user_id, bookmarkRow.user_id) && l.a(this.anime_slug, bookmarkRow.anime_slug) && l.a(this.created_at, bookmarkRow.created_at);
    }

    public final String getAnime_slug() {
        return this.anime_slug;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return this.created_at.hashCode() + A6.b.b(this.anime_slug, A6.b.b(this.user_id, this.id.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.user_id;
        String str3 = this.anime_slug;
        String str4 = this.created_at;
        StringBuilder sbC = c0.c("BookmarkRow(id=", str, ", user_id=", str2, ", anime_slug=");
        sbC.append(str3);
        sbC.append(", created_at=");
        sbC.append(str4);
        sbC.append(")");
        return sbC.toString();
    }

    public /* synthetic */ BookmarkRow(int i7, String str, String str2, String str3, String str4, o0 o0Var) {
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
            this.created_at = "";
        } else {
            this.created_at = str4;
        }
    }

    public BookmarkRow(String str, String str2, String str3, String str4) {
        l.f("id", str);
        l.f("user_id", str2);
        l.f("anime_slug", str3);
        l.f("created_at", str4);
        this.id = str;
        this.user_id = str2;
        this.anime_slug = str3;
        this.created_at = str4;
    }

    public /* synthetic */ BookmarkRow(String str, String str2, String str3, String str4, int i7, f fVar) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4);
    }
}
