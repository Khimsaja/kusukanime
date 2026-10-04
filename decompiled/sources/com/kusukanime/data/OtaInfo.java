package com.kusukanime.data;

import G3.k;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import p.AbstractC1755i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006&"}, d2 = {"Lcom/kusukanime/data/OtaInfo;", "", "id", "", "version_code", "", "version_name", "", "download_url", "changelog", "force_update", "", "created_at", "<init>", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()J", "getVersion_code", "()I", "getVersion_name", "()Ljava/lang/String;", "getDownload_url", "getChangelog", "getForce_update", "()Z", "getCreated_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class OtaInfo {
    public static final int $stable = 0;
    private final String changelog;
    private final String created_at;
    private final String download_url;
    private final boolean force_update;
    private final long id;
    private final int version_code;
    private final String version_name;

    public OtaInfo() {
        this(0L, 0, null, null, null, false, null, 127, null);
    }

    public static /* synthetic */ OtaInfo copy$default(OtaInfo otaInfo, long j7, int i7, String str, String str2, String str3, boolean z7, String str4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = otaInfo.id;
        }
        long j8 = j7;
        if ((i8 & 2) != 0) {
            i7 = otaInfo.version_code;
        }
        int i9 = i7;
        if ((i8 & 4) != 0) {
            str = otaInfo.version_name;
        }
        String str5 = str;
        if ((i8 & 8) != 0) {
            str2 = otaInfo.download_url;
        }
        String str6 = str2;
        if ((i8 & 16) != 0) {
            str3 = otaInfo.changelog;
        }
        return otaInfo.copy(j8, i9, str5, str6, str3, (i8 & 32) != 0 ? otaInfo.force_update : z7, (i8 & 64) != 0 ? otaInfo.created_at : str4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion_code() {
        return this.version_code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVersion_name() {
        return this.version_name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDownload_url() {
        return this.download_url;
    }

    /* renamed from: component5, reason: from getter */
    public final String getChangelog() {
        return this.changelog;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getForce_update() {
        return this.force_update;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCreated_at() {
        return this.created_at;
    }

    public final OtaInfo copy(long id, int version_code, String version_name, String download_url, String changelog, boolean force_update, String created_at) {
        l.f("version_name", version_name);
        l.f("download_url", download_url);
        l.f("changelog", changelog);
        l.f("created_at", created_at);
        return new OtaInfo(id, version_code, version_name, download_url, changelog, force_update, created_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtaInfo)) {
            return false;
        }
        OtaInfo otaInfo = (OtaInfo) other;
        return this.id == otaInfo.id && this.version_code == otaInfo.version_code && l.a(this.version_name, otaInfo.version_name) && l.a(this.download_url, otaInfo.download_url) && l.a(this.changelog, otaInfo.changelog) && this.force_update == otaInfo.force_update && l.a(this.created_at, otaInfo.created_at);
    }

    public final String getChangelog() {
        return this.changelog;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getDownload_url() {
        return this.download_url;
    }

    public final boolean getForce_update() {
        return this.force_update;
    }

    public final long getId() {
        return this.id;
    }

    public final int getVersion_code() {
        return this.version_code;
    }

    public final String getVersion_name() {
        return this.version_name;
    }

    public int hashCode() {
        return this.created_at.hashCode() + AbstractC0703b.d(A6.b.b(this.changelog, A6.b.b(this.download_url, A6.b.b(this.version_name, AbstractC1755i.a(this.version_code, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31, this.force_update);
    }

    public String toString() {
        return "OtaInfo(id=" + this.id + ", version_code=" + this.version_code + ", version_name=" + this.version_name + ", download_url=" + this.download_url + ", changelog=" + this.changelog + ", force_update=" + this.force_update + ", created_at=" + this.created_at + ")";
    }

    public OtaInfo(long j7, int i7, String str, String str2, String str3, boolean z7, String str4) {
        l.f("version_name", str);
        l.f("download_url", str2);
        l.f("changelog", str3);
        l.f("created_at", str4);
        this.id = j7;
        this.version_code = i7;
        this.version_name = str;
        this.download_url = str2;
        this.changelog = str3;
        this.force_update = z7;
        this.created_at = str4;
    }

    public /* synthetic */ OtaInfo(long j7, int i7, String str, String str2, String str3, boolean z7, String str4, int i8, f fVar) {
        this((i8 & 1) != 0 ? 0L : j7, (i8 & 2) != 0 ? 0 : i7, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? "" : str2, (i8 & 16) != 0 ? "" : str3, (i8 & 32) != 0 ? false : z7, (i8 & 64) != 0 ? "" : str4);
    }
}
