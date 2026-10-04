package io.github.jan.supabase.auth.event;

import A6.b;
import io.github.jan.supabase.annotations.SupabaseExperimental;
import io.github.jan.supabase.auth.exception.AuthErrorCode;
import io.github.jan.supabase.auth.status.RefreshFailureCause;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@SupabaseExperimental
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/auth/event/AuthEvent;", "", "OtpError", "RefreshFailure", "Lio/github/jan/supabase/auth/event/AuthEvent$OtpError;", "Lio/github/jan/supabase/auth/event/AuthEvent$RefreshFailure;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AuthEvent {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/event/AuthEvent$OtpError;", "Lio/github/jan/supabase/auth/event/AuthEvent;", "error", "", "errorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getErrorDescription", "errorCode", "Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "getErrorCode", "()Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OtpError implements AuthEvent {
        private final String error;
        private final AuthErrorCode errorCode;
        private final String errorDescription;

        public OtpError(String str, String str2) {
            l.f("error", str);
            l.f("errorDescription", str2);
            this.error = str;
            this.errorDescription = str2;
            this.errorCode = AuthErrorCode.INSTANCE.fromValue(str);
        }

        public static /* synthetic */ OtpError copy$default(OtpError otpError, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = otpError.error;
            }
            if ((i7 & 2) != 0) {
                str2 = otpError.errorDescription;
            }
            return otpError.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final OtpError copy(String error, String errorDescription) {
            l.f("error", error);
            l.f("errorDescription", errorDescription);
            return new OtpError(error, errorDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtpError)) {
                return false;
            }
            OtpError otpError = (OtpError) other;
            return l.a(this.error, otpError.error) && l.a(this.errorDescription, otpError.errorDescription);
        }

        public final String getError() {
            return this.error;
        }

        public final AuthErrorCode getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public int hashCode() {
            return this.errorDescription.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("OtpError(error=");
            sb.append(this.error);
            sb.append(", errorDescription=");
            return b.j(sb, this.errorDescription, ')');
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/event/AuthEvent$RefreshFailure;", "Lio/github/jan/supabase/auth/event/AuthEvent;", "cause", "Lio/github/jan/supabase/auth/status/RefreshFailureCause;", "<init>", "(Lio/github/jan/supabase/auth/status/RefreshFailureCause;)V", "getCause", "()Lio/github/jan/supabase/auth/status/RefreshFailureCause;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefreshFailure implements AuthEvent {
        private final RefreshFailureCause cause;

        public RefreshFailure(RefreshFailureCause refreshFailureCause) {
            l.f("cause", refreshFailureCause);
            this.cause = refreshFailureCause;
        }

        public static /* synthetic */ RefreshFailure copy$default(RefreshFailure refreshFailure, RefreshFailureCause refreshFailureCause, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                refreshFailureCause = refreshFailure.cause;
            }
            return refreshFailure.copy(refreshFailureCause);
        }

        /* renamed from: component1, reason: from getter */
        public final RefreshFailureCause getCause() {
            return this.cause;
        }

        public final RefreshFailure copy(RefreshFailureCause cause) {
            l.f("cause", cause);
            return new RefreshFailure(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RefreshFailure) && l.a(this.cause, ((RefreshFailure) other).cause);
        }

        public final RefreshFailureCause getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "RefreshFailure(cause=" + this.cause + ')';
        }
    }
}
