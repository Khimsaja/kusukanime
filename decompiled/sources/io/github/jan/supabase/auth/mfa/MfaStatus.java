package io.github.jan.supabase.auth.mfa;

import b1.AbstractC0703b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaStatus;", "", "enabled", "", "active", "<init>", "(ZZ)V", "getEnabled", "()Z", "getActive", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MfaStatus {
    private final boolean active;
    private final boolean enabled;

    public MfaStatus(boolean z7, boolean z8) {
        this.enabled = z7;
        this.active = z8;
    }

    public static /* synthetic */ MfaStatus copy$default(MfaStatus mfaStatus, boolean z7, boolean z8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = mfaStatus.enabled;
        }
        if ((i7 & 2) != 0) {
            z8 = mfaStatus.active;
        }
        return mfaStatus.copy(z7, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    public final MfaStatus copy(boolean enabled, boolean active) {
        return new MfaStatus(enabled, active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfaStatus)) {
            return false;
        }
        MfaStatus mfaStatus = (MfaStatus) other;
        return this.enabled == mfaStatus.enabled && this.active == mfaStatus.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.active) + (Boolean.hashCode(this.enabled) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MfaStatus(enabled=");
        sb.append(this.enabled);
        sb.append(", active=");
        return AbstractC0703b.n(sb, this.active, ')');
    }
}
