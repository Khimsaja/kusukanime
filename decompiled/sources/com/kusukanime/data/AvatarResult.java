package com.kusukanime.data;

import G3.k;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/kusukanime/data/AvatarResult;", "", "file_id", "", "avatar_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFile_id", "()Ljava/lang/String;", "getAvatar_url", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class AvatarResult {
    public static final int $stable = 0;
    private final String avatar_url;
    private final String file_id;

    /* JADX WARN: Multi-variable type inference failed */
    public AvatarResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AvatarResult copy$default(AvatarResult avatarResult, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = avatarResult.file_id;
        }
        if ((i7 & 2) != 0) {
            str2 = avatarResult.avatar_url;
        }
        return avatarResult.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFile_id() {
        return this.file_id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatar_url() {
        return this.avatar_url;
    }

    public final AvatarResult copy(String file_id, String avatar_url) {
        l.f("file_id", file_id);
        l.f("avatar_url", avatar_url);
        return new AvatarResult(file_id, avatar_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarResult)) {
            return false;
        }
        AvatarResult avatarResult = (AvatarResult) other;
        return l.a(this.file_id, avatarResult.file_id) && l.a(this.avatar_url, avatarResult.avatar_url);
    }

    public final String getAvatar_url() {
        return this.avatar_url;
    }

    public final String getFile_id() {
        return this.file_id;
    }

    public int hashCode() {
        return this.avatar_url.hashCode() + (this.file_id.hashCode() * 31);
    }

    public String toString() {
        return "AvatarResult(file_id=" + this.file_id + ", avatar_url=" + this.avatar_url + ")";
    }

    public AvatarResult(String str, String str2) {
        l.f("file_id", str);
        l.f("avatar_url", str2);
        this.file_id = str;
        this.avatar_url = str2;
    }

    public /* synthetic */ AvatarResult(String str, String str2, int i7, f fVar) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2);
    }
}
