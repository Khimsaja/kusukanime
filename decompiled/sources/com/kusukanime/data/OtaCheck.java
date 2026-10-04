package com.kusukanime.data;

import G3.k;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/kusukanime/data/OtaCheck;", "", "update", "", "force", "latest", "Lcom/kusukanime/data/OtaInfo;", "<init>", "(ZZLcom/kusukanime/data/OtaInfo;)V", "getUpdate", "()Z", "getForce", "getLatest", "()Lcom/kusukanime/data/OtaInfo;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class OtaCheck {
    public static final int $stable = 0;
    private final boolean force;
    private final OtaInfo latest;
    private final boolean update;

    public OtaCheck() {
        this(false, false, null, 7, null);
    }

    public static /* synthetic */ OtaCheck copy$default(OtaCheck otaCheck, boolean z7, boolean z8, OtaInfo otaInfo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = otaCheck.update;
        }
        if ((i7 & 2) != 0) {
            z8 = otaCheck.force;
        }
        if ((i7 & 4) != 0) {
            otaInfo = otaCheck.latest;
        }
        return otaCheck.copy(z7, z8, otaInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUpdate() {
        return this.update;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForce() {
        return this.force;
    }

    /* renamed from: component3, reason: from getter */
    public final OtaInfo getLatest() {
        return this.latest;
    }

    public final OtaCheck copy(boolean update, boolean force, OtaInfo latest) {
        return new OtaCheck(update, force, latest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtaCheck)) {
            return false;
        }
        OtaCheck otaCheck = (OtaCheck) other;
        return this.update == otaCheck.update && this.force == otaCheck.force && l.a(this.latest, otaCheck.latest);
    }

    public final boolean getForce() {
        return this.force;
    }

    public final OtaInfo getLatest() {
        return this.latest;
    }

    public final boolean getUpdate() {
        return this.update;
    }

    public int hashCode() {
        int iD = AbstractC0703b.d(Boolean.hashCode(this.update) * 31, 31, this.force);
        OtaInfo otaInfo = this.latest;
        return iD + (otaInfo == null ? 0 : otaInfo.hashCode());
    }

    public String toString() {
        return "OtaCheck(update=" + this.update + ", force=" + this.force + ", latest=" + this.latest + ")";
    }

    public OtaCheck(boolean z7, boolean z8, OtaInfo otaInfo) {
        this.update = z7;
        this.force = z8;
        this.latest = otaInfo;
    }

    public /* synthetic */ OtaCheck(boolean z7, boolean z8, OtaInfo otaInfo, int i7, f fVar) {
        this((i7 & 1) != 0 ? false : z7, (i7 & 2) != 0 ? false : z8, (i7 & 4) != 0 ? null : otaInfo);
    }
}
