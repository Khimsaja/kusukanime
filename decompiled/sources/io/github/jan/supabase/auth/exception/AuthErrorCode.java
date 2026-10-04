package io.github.jan.supabase.auth.exception;

import V3.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\\\b\u0086\u0081\u0002\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001^B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]¨\u0006_"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UnexpectedFailure", "ValidationFailed", "BadJson", "EmailExists", "PhoneExists", "BadJwt", "NotAdmin", "NoAuthorization", "UserNotFound", "SessionNotFound", "SessionExpired", "RefreshTokenNotFound", "RefreshTokenAlreadyUsed", "FlowStateNotFound", "FlowStateExpired", "SignupDisabled", "UserBanned", "ProviderEmailNeedsVerification", "InviteNotFound", "BadOauthState", "BadOauthCallback", "OauthProviderNotSupported", "UnexpectedAudience", "SingleIdentityNotDeletable", "EmailConflictIdentityNotDeletable", "IdentityAlreadyExists", "EmailProviderDisabled", "PhoneProviderDisabled", "TooManyEnrolledMfaFactors", "MfaFactorNameConflict", "MfaFactorNotFound", "MfaIpAddressMismatch", "MfaChallengeExpired", "MfaVerificationFailed", "MfaVerificationRejected", "InsufficientAal", "CaptchaFailed", "SamlProviderDisabled", "ManualLinkingDisabled", "SmsSendFailed", "EmailNotConfirmed", "PhoneNotConfirmed", "ReauthNonceMissing", "SamlRelayStateNotFound", "SamlRelayStateExpired", "SamlIdpNotFound", "SamlAssertionNoUserId", "SamlAssertionNoEmail", "UserAlreadyExists", "SsoProviderNotFound", "SamlMetadataFetchFailed", "SamlIdpAlreadyExists", "SsoDomainAlreadyExists", "SamlEntityIdMismatch", "Conflict", "ProviderDisabled", "UserSsoManaged", "ReauthenticationNeeded", "SamePassword", "ReauthenticationNotValid", "OtpExpired", "OtpDisabled", "IdentityNotFound", "WeakPassword", "OverRequestRateLimit", "OverEmailSendRateLimit", "OverSmsSendRateLimit", "BadCodeVerifier", "InvalidCredentials", "EmailAddressNotAuthorized", "AnonymousProviderDisabled", "HookTimeout", "HookTimeoutAfterRetry", "HookPayloadOverSizeLimit", "HookPayloadInvalidContentType", "RequestTimeout", "MfaPhoneEnrollDisabled", "MfaPhoneVerifyDisabled", "MfaTotpEnrollDisabled", "MfaTotpVerifyDisabled", "MfaWebAuthnEnrollDisabled", "MfaWebAuthnVerifyDisabled", "MfaVerifiedFactorExists", "EmailAddressInvalid", "Web3ProviderDisabled", "Web3UnsupportedChain", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthErrorCode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthErrorCode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;
    public static final AuthErrorCode UnexpectedFailure = new AuthErrorCode("UnexpectedFailure", 0, "unexpected_failure");
    public static final AuthErrorCode ValidationFailed = new AuthErrorCode("ValidationFailed", 1, "validation_failed");
    public static final AuthErrorCode BadJson = new AuthErrorCode("BadJson", 2, "bad_json");
    public static final AuthErrorCode EmailExists = new AuthErrorCode("EmailExists", 3, "email_exists");
    public static final AuthErrorCode PhoneExists = new AuthErrorCode("PhoneExists", 4, "phone_exists");
    public static final AuthErrorCode BadJwt = new AuthErrorCode("BadJwt", 5, "bad_jwt");
    public static final AuthErrorCode NotAdmin = new AuthErrorCode("NotAdmin", 6, "not_admin");
    public static final AuthErrorCode NoAuthorization = new AuthErrorCode("NoAuthorization", 7, "no_authorization");
    public static final AuthErrorCode UserNotFound = new AuthErrorCode("UserNotFound", 8, "user_not_found");
    public static final AuthErrorCode SessionNotFound = new AuthErrorCode("SessionNotFound", 9, AuthSessionMissingException.CODE);
    public static final AuthErrorCode SessionExpired = new AuthErrorCode("SessionExpired", 10, "session_expired");
    public static final AuthErrorCode RefreshTokenNotFound = new AuthErrorCode("RefreshTokenNotFound", 11, "refresh_token_not_found");
    public static final AuthErrorCode RefreshTokenAlreadyUsed = new AuthErrorCode("RefreshTokenAlreadyUsed", 12, "refresh_token_already_used");
    public static final AuthErrorCode FlowStateNotFound = new AuthErrorCode("FlowStateNotFound", 13, "flow_state_not_found");
    public static final AuthErrorCode FlowStateExpired = new AuthErrorCode("FlowStateExpired", 14, "flow_state_expired");
    public static final AuthErrorCode SignupDisabled = new AuthErrorCode("SignupDisabled", 15, "signup_disabled");
    public static final AuthErrorCode UserBanned = new AuthErrorCode("UserBanned", 16, "user_banned");
    public static final AuthErrorCode ProviderEmailNeedsVerification = new AuthErrorCode("ProviderEmailNeedsVerification", 17, "provider_email_needs_verification");
    public static final AuthErrorCode InviteNotFound = new AuthErrorCode("InviteNotFound", 18, "invite_not_found");
    public static final AuthErrorCode BadOauthState = new AuthErrorCode("BadOauthState", 19, "bad_oauth_state");
    public static final AuthErrorCode BadOauthCallback = new AuthErrorCode("BadOauthCallback", 20, "bad_oauth_callback");
    public static final AuthErrorCode OauthProviderNotSupported = new AuthErrorCode("OauthProviderNotSupported", 21, "oauth_provider_not_supported");
    public static final AuthErrorCode UnexpectedAudience = new AuthErrorCode("UnexpectedAudience", 22, "unexpected_audience");
    public static final AuthErrorCode SingleIdentityNotDeletable = new AuthErrorCode("SingleIdentityNotDeletable", 23, "single_identity_not_deletable");
    public static final AuthErrorCode EmailConflictIdentityNotDeletable = new AuthErrorCode("EmailConflictIdentityNotDeletable", 24, "email_conflict_identity_not_deletable");
    public static final AuthErrorCode IdentityAlreadyExists = new AuthErrorCode("IdentityAlreadyExists", 25, "identity_already_exists");
    public static final AuthErrorCode EmailProviderDisabled = new AuthErrorCode("EmailProviderDisabled", 26, "email_provider_disabled");
    public static final AuthErrorCode PhoneProviderDisabled = new AuthErrorCode("PhoneProviderDisabled", 27, "phone_provider_disabled");
    public static final AuthErrorCode TooManyEnrolledMfaFactors = new AuthErrorCode("TooManyEnrolledMfaFactors", 28, "too_many_enrolled_mfa_factors");
    public static final AuthErrorCode MfaFactorNameConflict = new AuthErrorCode("MfaFactorNameConflict", 29, "mfa_factor_name_conflict");
    public static final AuthErrorCode MfaFactorNotFound = new AuthErrorCode("MfaFactorNotFound", 30, "mfa_factor_not_found");
    public static final AuthErrorCode MfaIpAddressMismatch = new AuthErrorCode("MfaIpAddressMismatch", 31, "mfa_ip_address_mismatch");
    public static final AuthErrorCode MfaChallengeExpired = new AuthErrorCode("MfaChallengeExpired", 32, "mfa_challenge_expired");
    public static final AuthErrorCode MfaVerificationFailed = new AuthErrorCode("MfaVerificationFailed", 33, "mfa_verification_failed");
    public static final AuthErrorCode MfaVerificationRejected = new AuthErrorCode("MfaVerificationRejected", 34, "mfa_verification_rejected");
    public static final AuthErrorCode InsufficientAal = new AuthErrorCode("InsufficientAal", 35, "insufficient_aal");
    public static final AuthErrorCode CaptchaFailed = new AuthErrorCode("CaptchaFailed", 36, "captcha_failed");
    public static final AuthErrorCode SamlProviderDisabled = new AuthErrorCode("SamlProviderDisabled", 37, "saml_provider_disabled");
    public static final AuthErrorCode ManualLinkingDisabled = new AuthErrorCode("ManualLinkingDisabled", 38, "manual_linking_disabled");
    public static final AuthErrorCode SmsSendFailed = new AuthErrorCode("SmsSendFailed", 39, "sms_send_failed");
    public static final AuthErrorCode EmailNotConfirmed = new AuthErrorCode("EmailNotConfirmed", 40, "email_not_confirmed");
    public static final AuthErrorCode PhoneNotConfirmed = new AuthErrorCode("PhoneNotConfirmed", 41, "phone_not_confirmed");
    public static final AuthErrorCode ReauthNonceMissing = new AuthErrorCode("ReauthNonceMissing", 42, "reauth_nonce_missing");
    public static final AuthErrorCode SamlRelayStateNotFound = new AuthErrorCode("SamlRelayStateNotFound", 43, "saml_relay_state_not_found");
    public static final AuthErrorCode SamlRelayStateExpired = new AuthErrorCode("SamlRelayStateExpired", 44, "saml_relay_state_expired");
    public static final AuthErrorCode SamlIdpNotFound = new AuthErrorCode("SamlIdpNotFound", 45, "saml_idp_not_found");
    public static final AuthErrorCode SamlAssertionNoUserId = new AuthErrorCode("SamlAssertionNoUserId", 46, "saml_assertion_no_user_id");
    public static final AuthErrorCode SamlAssertionNoEmail = new AuthErrorCode("SamlAssertionNoEmail", 47, "saml_assertion_no_email");
    public static final AuthErrorCode UserAlreadyExists = new AuthErrorCode("UserAlreadyExists", 48, "user_already_exists");
    public static final AuthErrorCode SsoProviderNotFound = new AuthErrorCode("SsoProviderNotFound", 49, "sso_provider_not_found");
    public static final AuthErrorCode SamlMetadataFetchFailed = new AuthErrorCode("SamlMetadataFetchFailed", 50, "saml_metadata_fetch_failed");
    public static final AuthErrorCode SamlIdpAlreadyExists = new AuthErrorCode("SamlIdpAlreadyExists", 51, "saml_idp_already_exists");
    public static final AuthErrorCode SsoDomainAlreadyExists = new AuthErrorCode("SsoDomainAlreadyExists", 52, "sso_domain_already_exists");
    public static final AuthErrorCode SamlEntityIdMismatch = new AuthErrorCode("SamlEntityIdMismatch", 53, "saml_entity_id_mismatch");
    public static final AuthErrorCode Conflict = new AuthErrorCode("Conflict", 54, "conflict");
    public static final AuthErrorCode ProviderDisabled = new AuthErrorCode("ProviderDisabled", 55, "provider_disabled");
    public static final AuthErrorCode UserSsoManaged = new AuthErrorCode("UserSsoManaged", 56, "user_sso_managed");
    public static final AuthErrorCode ReauthenticationNeeded = new AuthErrorCode("ReauthenticationNeeded", 57, "reauthentication_needed");
    public static final AuthErrorCode SamePassword = new AuthErrorCode("SamePassword", 58, "same_password");
    public static final AuthErrorCode ReauthenticationNotValid = new AuthErrorCode("ReauthenticationNotValid", 59, "reauthentication_not_valid");
    public static final AuthErrorCode OtpExpired = new AuthErrorCode("OtpExpired", 60, "otp_expired");
    public static final AuthErrorCode OtpDisabled = new AuthErrorCode("OtpDisabled", 61, "otp_disabled");
    public static final AuthErrorCode IdentityNotFound = new AuthErrorCode("IdentityNotFound", 62, "identity_not_found");
    public static final AuthErrorCode WeakPassword = new AuthErrorCode("WeakPassword", 63, AuthWeakPasswordException.CODE);
    public static final AuthErrorCode OverRequestRateLimit = new AuthErrorCode("OverRequestRateLimit", 64, "over_request_rate_limit");
    public static final AuthErrorCode OverEmailSendRateLimit = new AuthErrorCode("OverEmailSendRateLimit", 65, "over_email_send_rate_limit");
    public static final AuthErrorCode OverSmsSendRateLimit = new AuthErrorCode("OverSmsSendRateLimit", 66, "over_sms_send_rate_limit");
    public static final AuthErrorCode BadCodeVerifier = new AuthErrorCode("BadCodeVerifier", 67, "bad_code_verifier");
    public static final AuthErrorCode InvalidCredentials = new AuthErrorCode("InvalidCredentials", 68, "invalid_credentials");
    public static final AuthErrorCode EmailAddressNotAuthorized = new AuthErrorCode("EmailAddressNotAuthorized", 69, "email_address_not_authorized");
    public static final AuthErrorCode AnonymousProviderDisabled = new AuthErrorCode("AnonymousProviderDisabled", 70, "anonymous_provider_disabled");
    public static final AuthErrorCode HookTimeout = new AuthErrorCode("HookTimeout", 71, "hook_timeout");
    public static final AuthErrorCode HookTimeoutAfterRetry = new AuthErrorCode("HookTimeoutAfterRetry", 72, "hook_timeout_after_retry");
    public static final AuthErrorCode HookPayloadOverSizeLimit = new AuthErrorCode("HookPayloadOverSizeLimit", 73, "hook_payload_over_size_limit");
    public static final AuthErrorCode HookPayloadInvalidContentType = new AuthErrorCode("HookPayloadInvalidContentType", 74, "hook_payload_invalid_content_type");
    public static final AuthErrorCode RequestTimeout = new AuthErrorCode("RequestTimeout", 75, "request_timeout");
    public static final AuthErrorCode MfaPhoneEnrollDisabled = new AuthErrorCode("MfaPhoneEnrollDisabled", 76, "mfa_phone_enroll_not_enabled");
    public static final AuthErrorCode MfaPhoneVerifyDisabled = new AuthErrorCode("MfaPhoneVerifyDisabled", 77, "mfa_phone_verify_not_enabled");
    public static final AuthErrorCode MfaTotpEnrollDisabled = new AuthErrorCode("MfaTotpEnrollDisabled", 78, "mfa_totp_enroll_not_enabled");
    public static final AuthErrorCode MfaTotpVerifyDisabled = new AuthErrorCode("MfaTotpVerifyDisabled", 79, "mfa_totp_verify_not_enabled");
    public static final AuthErrorCode MfaWebAuthnEnrollDisabled = new AuthErrorCode("MfaWebAuthnEnrollDisabled", 80, "mfa_webauthn_enroll_not_enabled");
    public static final AuthErrorCode MfaWebAuthnVerifyDisabled = new AuthErrorCode("MfaWebAuthnVerifyDisabled", 81, "mfa_webauthn_verify_not_enabled");
    public static final AuthErrorCode MfaVerifiedFactorExists = new AuthErrorCode("MfaVerifiedFactorExists", 82, "mfa_verified_factor_exists");
    public static final AuthErrorCode EmailAddressInvalid = new AuthErrorCode("EmailAddressInvalid", 83, "email_address_invalid");
    public static final AuthErrorCode Web3ProviderDisabled = new AuthErrorCode("Web3ProviderDisabled", 84, "web3_provider_disabled");
    public static final AuthErrorCode Web3UnsupportedChain = new AuthErrorCode("Web3UnsupportedChain", 85, "web3_unsupported_chain");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthErrorCode$Companion;", "", "<init>", "()V", "fromValue", "Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "value", "", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final AuthErrorCode fromValue(String value) {
            Object next;
            l.f("value", value);
            Iterator<E> it = AuthErrorCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (l.a(((AuthErrorCode) next).getValue(), value)) {
                    break;
                }
            }
            return (AuthErrorCode) next;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AuthErrorCode[] $values() {
        return new AuthErrorCode[]{UnexpectedFailure, ValidationFailed, BadJson, EmailExists, PhoneExists, BadJwt, NotAdmin, NoAuthorization, UserNotFound, SessionNotFound, SessionExpired, RefreshTokenNotFound, RefreshTokenAlreadyUsed, FlowStateNotFound, FlowStateExpired, SignupDisabled, UserBanned, ProviderEmailNeedsVerification, InviteNotFound, BadOauthState, BadOauthCallback, OauthProviderNotSupported, UnexpectedAudience, SingleIdentityNotDeletable, EmailConflictIdentityNotDeletable, IdentityAlreadyExists, EmailProviderDisabled, PhoneProviderDisabled, TooManyEnrolledMfaFactors, MfaFactorNameConflict, MfaFactorNotFound, MfaIpAddressMismatch, MfaChallengeExpired, MfaVerificationFailed, MfaVerificationRejected, InsufficientAal, CaptchaFailed, SamlProviderDisabled, ManualLinkingDisabled, SmsSendFailed, EmailNotConfirmed, PhoneNotConfirmed, ReauthNonceMissing, SamlRelayStateNotFound, SamlRelayStateExpired, SamlIdpNotFound, SamlAssertionNoUserId, SamlAssertionNoEmail, UserAlreadyExists, SsoProviderNotFound, SamlMetadataFetchFailed, SamlIdpAlreadyExists, SsoDomainAlreadyExists, SamlEntityIdMismatch, Conflict, ProviderDisabled, UserSsoManaged, ReauthenticationNeeded, SamePassword, ReauthenticationNotValid, OtpExpired, OtpDisabled, IdentityNotFound, WeakPassword, OverRequestRateLimit, OverEmailSendRateLimit, OverSmsSendRateLimit, BadCodeVerifier, InvalidCredentials, EmailAddressNotAuthorized, AnonymousProviderDisabled, HookTimeout, HookTimeoutAfterRetry, HookPayloadOverSizeLimit, HookPayloadInvalidContentType, RequestTimeout, MfaPhoneEnrollDisabled, MfaPhoneVerifyDisabled, MfaTotpEnrollDisabled, MfaTotpVerifyDisabled, MfaWebAuthnEnrollDisabled, MfaWebAuthnVerifyDisabled, MfaVerifiedFactorExists, EmailAddressInvalid, Web3ProviderDisabled, Web3UnsupportedChain};
    }

    static {
        AuthErrorCode[] authErrorCodeArr$values = $values();
        $VALUES = authErrorCodeArr$values;
        $ENTRIES = AbstractC1420H.z(authErrorCodeArr$values);
        INSTANCE = new Companion(null);
    }

    private AuthErrorCode(String str, int i7, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AuthErrorCode valueOf(String str) {
        return (AuthErrorCode) Enum.valueOf(AuthErrorCode.class, str);
    }

    public static AuthErrorCode[] values() {
        return (AuthErrorCode[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
