package io.github.jan.supabase.auth.mfa;

import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaLevel;", "", "current", "Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel;", LinkHeader.Rel.Next, "<init>", "(Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel;Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel;)V", "getCurrent", "()Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel;", "getNext", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MfaLevel {
    private final AuthenticatorAssuranceLevel current;
    private final AuthenticatorAssuranceLevel next;

    public MfaLevel(AuthenticatorAssuranceLevel authenticatorAssuranceLevel, AuthenticatorAssuranceLevel authenticatorAssuranceLevel2) {
        l.f("current", authenticatorAssuranceLevel);
        l.f(LinkHeader.Rel.Next, authenticatorAssuranceLevel2);
        this.current = authenticatorAssuranceLevel;
        this.next = authenticatorAssuranceLevel2;
    }

    public static /* synthetic */ MfaLevel copy$default(MfaLevel mfaLevel, AuthenticatorAssuranceLevel authenticatorAssuranceLevel, AuthenticatorAssuranceLevel authenticatorAssuranceLevel2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            authenticatorAssuranceLevel = mfaLevel.current;
        }
        if ((i7 & 2) != 0) {
            authenticatorAssuranceLevel2 = mfaLevel.next;
        }
        return mfaLevel.copy(authenticatorAssuranceLevel, authenticatorAssuranceLevel2);
    }

    /* renamed from: component1, reason: from getter */
    public final AuthenticatorAssuranceLevel getCurrent() {
        return this.current;
    }

    /* renamed from: component2, reason: from getter */
    public final AuthenticatorAssuranceLevel getNext() {
        return this.next;
    }

    public final MfaLevel copy(AuthenticatorAssuranceLevel current, AuthenticatorAssuranceLevel next) {
        l.f("current", current);
        l.f(LinkHeader.Rel.Next, next);
        return new MfaLevel(current, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfaLevel)) {
            return false;
        }
        MfaLevel mfaLevel = (MfaLevel) other;
        return this.current == mfaLevel.current && this.next == mfaLevel.next;
    }

    public final AuthenticatorAssuranceLevel getCurrent() {
        return this.current;
    }

    public final AuthenticatorAssuranceLevel getNext() {
        return this.next;
    }

    public int hashCode() {
        return this.next.hashCode() + (this.current.hashCode() * 31);
    }

    public String toString() {
        return "MfaLevel(current=" + this.current + ", next=" + this.next + ')';
    }
}
