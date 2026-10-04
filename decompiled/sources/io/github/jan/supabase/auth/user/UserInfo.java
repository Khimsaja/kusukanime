package io.github.jan.supabase.auth.user;

import A5.d;
import J3.a;
import O3.j;
import P3.y;
import V5.h;
import V5.i;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.C0629d;
import Z5.K;
import Z5.o0;
import Z5.t0;
import a6.x;
import io.ktor.utils.io.ByteChannelKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ~2\u00020\u0001:\u0002}~B\u009d\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001f\u0010 B\u008d\u0002\b\u0010\u0012\u0006\u0010!\u001a\u00020\"\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\u001f\u0010%J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\u0011\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J£\u0002\u0010o\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010p\u001a\u00020q2\b\u0010r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010s\u001a\u00020\"HÖ\u0001J\t\u0010t\u001a\u00020\u0005HÖ\u0001J%\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020{H\u0001¢\u0006\u0002\b|R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010'\u001a\u0004\b+\u0010,R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010'\u001a\u0004\b.\u0010/R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010'\u001a\u0004\b1\u0010/R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010'\u001a\u0004\b3\u0010/R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010'\u001a\u0004\b5\u0010,R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010'\u001a\u0004\b7\u0010/R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010'\u001a\u0004\b;\u0010,R$\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010'\u001a\u0004\b=\u00109R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010'\u001a\u0004\b?\u0010/R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010'\u001a\u0004\bA\u0010,R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010'\u001a\u0004\bC\u0010,R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010'\u001a\u0004\bE\u0010/R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010'\u001a\u0004\bG\u0010)R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010'\u001a\u0004\bI\u0010/R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010'\u001a\u0004\bK\u0010,R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010'\u001a\u0004\bM\u0010/R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010'\u001a\u0004\bO\u0010,R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010'\u001a\u0004\bQ\u0010/R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010'\u001a\u0004\bS\u0010/R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u0010'\u001a\u0004\bU\u0010/R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010'\u001a\u0004\bW\u0010,¨\u0006\u007f"}, d2 = {"Lio/github/jan/supabase/auth/user/UserInfo;", "", "appMetadata", "Lkotlinx/serialization/json/JsonObject;", "aud", "", "confirmationSentAt", "Lkotlin/time/Instant;", "confirmedAt", "createdAt", "email", "emailConfirmedAt", "factors", "", "Lio/github/jan/supabase/auth/user/UserMfaFactor;", "id", "identities", "Lio/github/jan/supabase/auth/user/Identity;", "lastSignInAt", "phone", "role", "updatedAt", "userMetadata", "phoneChangeSentAt", "newPhone", "emailChangeSentAt", "newEmail", "invitedAt", "recoverySentAt", "phoneConfirmedAt", "actionLink", "<init>", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlin/time/Instant;Ljava/lang/String;Lkotlin/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlin/time/Instant;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;Lkotlinx/serialization/json/JsonObject;Lkotlin/time/Instant;Ljava/lang/String;Lkotlin/time/Instant;Ljava/lang/String;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlin/time/Instant;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlin/time/Instant;Ljava/lang/String;Lkotlin/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlin/time/Instant;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;Lkotlinx/serialization/json/JsonObject;Lkotlin/time/Instant;Ljava/lang/String;Lkotlin/time/Instant;Ljava/lang/String;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlin/time/Instant;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAppMetadata$annotations", "()V", "getAppMetadata", "()Lkotlinx/serialization/json/JsonObject;", "getAud$annotations", "getAud", "()Ljava/lang/String;", "getConfirmationSentAt$annotations", "getConfirmationSentAt", "()Lkotlin/time/Instant;", "getConfirmedAt$annotations", "getConfirmedAt", "getCreatedAt$annotations", "getCreatedAt", "getEmail$annotations", "getEmail", "getEmailConfirmedAt$annotations", "getEmailConfirmedAt", "getFactors", "()Ljava/util/List;", "getId$annotations", "getId", "getIdentities$annotations", "getIdentities", "getLastSignInAt$annotations", "getLastSignInAt", "getPhone$annotations", "getPhone", "getRole$annotations", "getRole", "getUpdatedAt$annotations", "getUpdatedAt", "getUserMetadata$annotations", "getUserMetadata", "getPhoneChangeSentAt$annotations", "getPhoneChangeSentAt", "getNewPhone$annotations", "getNewPhone", "getEmailChangeSentAt$annotations", "getEmailChangeSentAt", "getNewEmail$annotations", "getNewEmail", "getInvitedAt$annotations", "getInvitedAt", "getRecoverySentAt$annotations", "getRecoverySentAt", "getPhoneConfirmedAt$annotations", "getPhoneConfirmedAt", "getActionLink$annotations", "getActionLink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class UserInfo {
    private static final O3.i[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String actionLink;
    private final c appMetadata;
    private final String aud;
    private final d confirmationSentAt;
    private final d confirmedAt;
    private final d createdAt;
    private final String email;
    private final d emailChangeSentAt;
    private final d emailConfirmedAt;
    private final List<UserMfaFactor> factors;
    private final String id;
    private final List<Identity> identities;
    private final d invitedAt;
    private final d lastSignInAt;
    private final String newEmail;
    private final String newPhone;
    private final String phone;
    private final d phoneChangeSentAt;
    private final d phoneConfirmedAt;
    private final d recoverySentAt;
    private final String role;
    private final d updatedAt;
    private final c userMetadata;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/user/UserInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/user/UserInfo;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return UserInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        j jVar = j.f7525k;
        $childSerializers = new O3.i[]{null, null, null, null, null, null, null, z1.c.B(jVar, new a(0)), null, z1.c.B(jVar, new a(1)), null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ UserInfo(int i7, c cVar, String str, d dVar, d dVar2, d dVar3, String str2, d dVar4, List list, String str3, List list2, d dVar5, String str4, String str5, d dVar6, c cVar2, d dVar7, String str6, d dVar8, String str7, d dVar9, d dVar10, d dVar11, String str8, o0 o0Var) {
        if (258 != (i7 & 258)) {
            AbstractC0632e0.j(i7, 258, UserInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i7 & 1) == 0) {
            this.appMetadata = null;
        } else {
            this.appMetadata = cVar;
        }
        this.aud = str;
        if ((i7 & 4) == 0) {
            this.confirmationSentAt = null;
        } else {
            this.confirmationSentAt = dVar;
        }
        if ((i7 & 8) == 0) {
            this.confirmedAt = null;
        } else {
            this.confirmedAt = dVar2;
        }
        if ((i7 & 16) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = dVar3;
        }
        if ((i7 & 32) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        if ((i7 & 64) == 0) {
            this.emailConfirmedAt = null;
        } else {
            this.emailConfirmedAt = dVar4;
        }
        if ((i7 & 128) == 0) {
            this.factors = y.f7779k;
        } else {
            this.factors = list;
        }
        this.id = str3;
        if ((i7 & 512) == 0) {
            this.identities = null;
        } else {
            this.identities = list2;
        }
        if ((i7 & 1024) == 0) {
            this.lastSignInAt = null;
        } else {
            this.lastSignInAt = dVar5;
        }
        if ((i7 & 2048) == 0) {
            this.phone = null;
        } else {
            this.phone = str4;
        }
        if ((i7 & 4096) == 0) {
            this.role = null;
        } else {
            this.role = str5;
        }
        if ((i7 & 8192) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = dVar6;
        }
        if ((i7 & 16384) == 0) {
            this.userMetadata = null;
        } else {
            this.userMetadata = cVar2;
        }
        if ((32768 & i7) == 0) {
            this.phoneChangeSentAt = null;
        } else {
            this.phoneChangeSentAt = dVar7;
        }
        if ((65536 & i7) == 0) {
            this.newPhone = null;
        } else {
            this.newPhone = str6;
        }
        if ((131072 & i7) == 0) {
            this.emailChangeSentAt = null;
        } else {
            this.emailChangeSentAt = dVar8;
        }
        if ((262144 & i7) == 0) {
            this.newEmail = null;
        } else {
            this.newEmail = str7;
        }
        if ((524288 & i7) == 0) {
            this.invitedAt = null;
        } else {
            this.invitedAt = dVar9;
        }
        if ((1048576 & i7) == 0) {
            this.recoverySentAt = null;
        } else {
            this.recoverySentAt = dVar10;
        }
        if ((2097152 & i7) == 0) {
            this.phoneConfirmedAt = null;
        } else {
            this.phoneConfirmedAt = dVar11;
        }
        if ((i7 & 4194304) == 0) {
            this.actionLink = null;
        } else {
            this.actionLink = str8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new C0629d(UserMfaFactor$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new C0629d(Identity$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, c cVar, String str, d dVar, d dVar2, d dVar3, String str2, d dVar4, List list, String str3, List list2, d dVar5, String str4, String str5, d dVar6, c cVar2, d dVar7, String str6, d dVar8, String str7, d dVar9, d dVar10, d dVar11, String str8, int i7, Object obj) {
        String str9;
        d dVar12;
        c cVar3 = (i7 & 1) != 0 ? userInfo.appMetadata : cVar;
        String str10 = (i7 & 2) != 0 ? userInfo.aud : str;
        d dVar13 = (i7 & 4) != 0 ? userInfo.confirmationSentAt : dVar;
        d dVar14 = (i7 & 8) != 0 ? userInfo.confirmedAt : dVar2;
        d dVar15 = (i7 & 16) != 0 ? userInfo.createdAt : dVar3;
        String str11 = (i7 & 32) != 0 ? userInfo.email : str2;
        d dVar16 = (i7 & 64) != 0 ? userInfo.emailConfirmedAt : dVar4;
        List list3 = (i7 & 128) != 0 ? userInfo.factors : list;
        String str12 = (i7 & 256) != 0 ? userInfo.id : str3;
        List list4 = (i7 & 512) != 0 ? userInfo.identities : list2;
        d dVar17 = (i7 & 1024) != 0 ? userInfo.lastSignInAt : dVar5;
        String str13 = (i7 & 2048) != 0 ? userInfo.phone : str4;
        String str14 = (i7 & 4096) != 0 ? userInfo.role : str5;
        d dVar18 = (i7 & 8192) != 0 ? userInfo.updatedAt : dVar6;
        c cVar4 = cVar3;
        c cVar5 = (i7 & 16384) != 0 ? userInfo.userMetadata : cVar2;
        d dVar19 = (i7 & 32768) != 0 ? userInfo.phoneChangeSentAt : dVar7;
        String str15 = (i7 & 65536) != 0 ? userInfo.newPhone : str6;
        d dVar20 = (i7 & 131072) != 0 ? userInfo.emailChangeSentAt : dVar8;
        String str16 = (i7 & 262144) != 0 ? userInfo.newEmail : str7;
        d dVar21 = (i7 & 524288) != 0 ? userInfo.invitedAt : dVar9;
        d dVar22 = (i7 & ByteChannelKt.CHANNEL_MAX_SIZE) != 0 ? userInfo.recoverySentAt : dVar10;
        d dVar23 = (i7 & 2097152) != 0 ? userInfo.phoneConfirmedAt : dVar11;
        if ((i7 & 4194304) != 0) {
            dVar12 = dVar23;
            str9 = userInfo.actionLink;
        } else {
            str9 = str8;
            dVar12 = dVar23;
        }
        return userInfo.copy(cVar4, str10, dVar13, dVar14, dVar15, str11, dVar16, list3, str12, list4, dVar17, str13, str14, dVar18, cVar5, dVar19, str15, dVar20, str16, dVar21, dVar22, dVar12, str9);
    }

    @h("action_link")
    public static /* synthetic */ void getActionLink$annotations() {
    }

    @h("app_metadata")
    public static /* synthetic */ void getAppMetadata$annotations() {
    }

    @h("aud")
    public static /* synthetic */ void getAud$annotations() {
    }

    @h("confirmation_sent_at")
    public static /* synthetic */ void getConfirmationSentAt$annotations() {
    }

    @h("confirmed_at")
    public static /* synthetic */ void getConfirmedAt$annotations() {
    }

    @h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @h("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @h("email_change_sent_at")
    public static /* synthetic */ void getEmailChangeSentAt$annotations() {
    }

    @h("email_confirmed_at")
    public static /* synthetic */ void getEmailConfirmedAt$annotations() {
    }

    @h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @h("identities")
    public static /* synthetic */ void getIdentities$annotations() {
    }

    @h("invited_at")
    public static /* synthetic */ void getInvitedAt$annotations() {
    }

    @h("last_sign_in_at")
    public static /* synthetic */ void getLastSignInAt$annotations() {
    }

    @h("new_email")
    public static /* synthetic */ void getNewEmail$annotations() {
    }

    @h("new_phone")
    public static /* synthetic */ void getNewPhone$annotations() {
    }

    @h("phone")
    public static /* synthetic */ void getPhone$annotations() {
    }

    @h("phone_change_sent_at")
    public static /* synthetic */ void getPhoneChangeSentAt$annotations() {
    }

    @h("phone_confirmed_at")
    public static /* synthetic */ void getPhoneConfirmedAt$annotations() {
    }

    @h("recovery_sent_at")
    public static /* synthetic */ void getRecoverySentAt$annotations() {
    }

    @h("role")
    public static /* synthetic */ void getRole$annotations() {
    }

    @h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @h("user_metadata")
    public static /* synthetic */ void getUserMetadata$annotations() {
    }

    public static final /* synthetic */ void write$Self$auth_kt_release(UserInfo userInfo, b bVar, SerialDescriptor serialDescriptor) {
        O3.i[] iVarArr = $childSerializers;
        if (bVar.z(serialDescriptor) || userInfo.appMetadata != null) {
            bVar.F(serialDescriptor, 0, x.a, userInfo.appMetadata);
        }
        bVar.E(serialDescriptor, 1, userInfo.aud);
        if (bVar.z(serialDescriptor) || userInfo.confirmationSentAt != null) {
            bVar.F(serialDescriptor, 2, K.a, userInfo.confirmationSentAt);
        }
        if (bVar.z(serialDescriptor) || userInfo.confirmedAt != null) {
            bVar.F(serialDescriptor, 3, K.a, userInfo.confirmedAt);
        }
        if (bVar.z(serialDescriptor) || userInfo.createdAt != null) {
            bVar.F(serialDescriptor, 4, K.a, userInfo.createdAt);
        }
        if (bVar.z(serialDescriptor) || userInfo.email != null) {
            bVar.F(serialDescriptor, 5, t0.a, userInfo.email);
        }
        if (bVar.z(serialDescriptor) || userInfo.emailConfirmedAt != null) {
            bVar.F(serialDescriptor, 6, K.a, userInfo.emailConfirmedAt);
        }
        if (bVar.z(serialDescriptor) || !l.a(userInfo.factors, y.f7779k)) {
            bVar.j(serialDescriptor, 7, (KSerializer) iVarArr[7].getValue(), userInfo.factors);
        }
        bVar.E(serialDescriptor, 8, userInfo.id);
        if (bVar.z(serialDescriptor) || userInfo.identities != null) {
            bVar.F(serialDescriptor, 9, (KSerializer) iVarArr[9].getValue(), userInfo.identities);
        }
        if (bVar.z(serialDescriptor) || userInfo.lastSignInAt != null) {
            bVar.F(serialDescriptor, 10, K.a, userInfo.lastSignInAt);
        }
        if (bVar.z(serialDescriptor) || userInfo.phone != null) {
            bVar.F(serialDescriptor, 11, t0.a, userInfo.phone);
        }
        if (bVar.z(serialDescriptor) || userInfo.role != null) {
            bVar.F(serialDescriptor, 12, t0.a, userInfo.role);
        }
        if (bVar.z(serialDescriptor) || userInfo.updatedAt != null) {
            bVar.F(serialDescriptor, 13, K.a, userInfo.updatedAt);
        }
        if (bVar.z(serialDescriptor) || userInfo.userMetadata != null) {
            bVar.F(serialDescriptor, 14, x.a, userInfo.userMetadata);
        }
        if (bVar.z(serialDescriptor) || userInfo.phoneChangeSentAt != null) {
            bVar.F(serialDescriptor, 15, K.a, userInfo.phoneChangeSentAt);
        }
        if (bVar.z(serialDescriptor) || userInfo.newPhone != null) {
            bVar.F(serialDescriptor, 16, t0.a, userInfo.newPhone);
        }
        if (bVar.z(serialDescriptor) || userInfo.emailChangeSentAt != null) {
            bVar.F(serialDescriptor, 17, K.a, userInfo.emailChangeSentAt);
        }
        if (bVar.z(serialDescriptor) || userInfo.newEmail != null) {
            bVar.F(serialDescriptor, 18, t0.a, userInfo.newEmail);
        }
        if (bVar.z(serialDescriptor) || userInfo.invitedAt != null) {
            bVar.F(serialDescriptor, 19, K.a, userInfo.invitedAt);
        }
        if (bVar.z(serialDescriptor) || userInfo.recoverySentAt != null) {
            bVar.F(serialDescriptor, 20, K.a, userInfo.recoverySentAt);
        }
        if (bVar.z(serialDescriptor) || userInfo.phoneConfirmedAt != null) {
            bVar.F(serialDescriptor, 21, K.a, userInfo.phoneConfirmedAt);
        }
        if (!bVar.z(serialDescriptor) && userInfo.actionLink == null) {
            return;
        }
        bVar.F(serialDescriptor, 22, t0.a, userInfo.actionLink);
    }

    /* renamed from: component1, reason: from getter */
    public final c getAppMetadata() {
        return this.appMetadata;
    }

    public final List<Identity> component10() {
        return this.identities;
    }

    /* renamed from: component11, reason: from getter */
    public final d getLastSignInAt() {
        return this.lastSignInAt;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component13, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component14, reason: from getter */
    public final d getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component15, reason: from getter */
    public final c getUserMetadata() {
        return this.userMetadata;
    }

    /* renamed from: component16, reason: from getter */
    public final d getPhoneChangeSentAt() {
        return this.phoneChangeSentAt;
    }

    /* renamed from: component17, reason: from getter */
    public final String getNewPhone() {
        return this.newPhone;
    }

    /* renamed from: component18, reason: from getter */
    public final d getEmailChangeSentAt() {
        return this.emailChangeSentAt;
    }

    /* renamed from: component19, reason: from getter */
    public final String getNewEmail() {
        return this.newEmail;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAud() {
        return this.aud;
    }

    /* renamed from: component20, reason: from getter */
    public final d getInvitedAt() {
        return this.invitedAt;
    }

    /* renamed from: component21, reason: from getter */
    public final d getRecoverySentAt() {
        return this.recoverySentAt;
    }

    /* renamed from: component22, reason: from getter */
    public final d getPhoneConfirmedAt() {
        return this.phoneConfirmedAt;
    }

    /* renamed from: component23, reason: from getter */
    public final String getActionLink() {
        return this.actionLink;
    }

    /* renamed from: component3, reason: from getter */
    public final d getConfirmationSentAt() {
        return this.confirmationSentAt;
    }

    /* renamed from: component4, reason: from getter */
    public final d getConfirmedAt() {
        return this.confirmedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final d getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component7, reason: from getter */
    public final d getEmailConfirmedAt() {
        return this.emailConfirmedAt;
    }

    public final List<UserMfaFactor> component8() {
        return this.factors;
    }

    /* renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final UserInfo copy(c cVar, String str, d dVar, d dVar2, d dVar3, String str2, d dVar4, List<UserMfaFactor> list, String str3, List<Identity> list2, d dVar5, String str4, String str5, d dVar6, c cVar2, d dVar7, String str6, d dVar8, String str7, d dVar9, d dVar10, d dVar11, String str8) {
        l.f("aud", str);
        l.f("factors", list);
        l.f("id", str3);
        return new UserInfo(cVar, str, dVar, dVar2, dVar3, str2, dVar4, list, str3, list2, dVar5, str4, str5, dVar6, cVar2, dVar7, str6, dVar8, str7, dVar9, dVar10, dVar11, str8);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return l.a(this.appMetadata, userInfo.appMetadata) && l.a(this.aud, userInfo.aud) && l.a(this.confirmationSentAt, userInfo.confirmationSentAt) && l.a(this.confirmedAt, userInfo.confirmedAt) && l.a(this.createdAt, userInfo.createdAt) && l.a(this.email, userInfo.email) && l.a(this.emailConfirmedAt, userInfo.emailConfirmedAt) && l.a(this.factors, userInfo.factors) && l.a(this.id, userInfo.id) && l.a(this.identities, userInfo.identities) && l.a(this.lastSignInAt, userInfo.lastSignInAt) && l.a(this.phone, userInfo.phone) && l.a(this.role, userInfo.role) && l.a(this.updatedAt, userInfo.updatedAt) && l.a(this.userMetadata, userInfo.userMetadata) && l.a(this.phoneChangeSentAt, userInfo.phoneChangeSentAt) && l.a(this.newPhone, userInfo.newPhone) && l.a(this.emailChangeSentAt, userInfo.emailChangeSentAt) && l.a(this.newEmail, userInfo.newEmail) && l.a(this.invitedAt, userInfo.invitedAt) && l.a(this.recoverySentAt, userInfo.recoverySentAt) && l.a(this.phoneConfirmedAt, userInfo.phoneConfirmedAt) && l.a(this.actionLink, userInfo.actionLink);
    }

    public final String getActionLink() {
        return this.actionLink;
    }

    public final c getAppMetadata() {
        return this.appMetadata;
    }

    public final String getAud() {
        return this.aud;
    }

    public final d getConfirmationSentAt() {
        return this.confirmationSentAt;
    }

    public final d getConfirmedAt() {
        return this.confirmedAt;
    }

    public final d getCreatedAt() {
        return this.createdAt;
    }

    public final String getEmail() {
        return this.email;
    }

    public final d getEmailChangeSentAt() {
        return this.emailChangeSentAt;
    }

    public final d getEmailConfirmedAt() {
        return this.emailConfirmedAt;
    }

    public final List<UserMfaFactor> getFactors() {
        return this.factors;
    }

    public final String getId() {
        return this.id;
    }

    public final List<Identity> getIdentities() {
        return this.identities;
    }

    public final d getInvitedAt() {
        return this.invitedAt;
    }

    public final d getLastSignInAt() {
        return this.lastSignInAt;
    }

    public final String getNewEmail() {
        return this.newEmail;
    }

    public final String getNewPhone() {
        return this.newPhone;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final d getPhoneChangeSentAt() {
        return this.phoneChangeSentAt;
    }

    public final d getPhoneConfirmedAt() {
        return this.phoneConfirmedAt;
    }

    public final d getRecoverySentAt() {
        return this.recoverySentAt;
    }

    public final String getRole() {
        return this.role;
    }

    public final d getUpdatedAt() {
        return this.updatedAt;
    }

    public final c getUserMetadata() {
        return this.userMetadata;
    }

    public int hashCode() {
        c cVar = this.appMetadata;
        int iB = A6.b.b(this.aud, (cVar == null ? 0 : cVar.f12722k.hashCode()) * 31, 31);
        d dVar = this.confirmationSentAt;
        int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.confirmedAt;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.createdAt;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        String str = this.email;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        d dVar4 = this.emailConfirmedAt;
        int iB2 = A6.b.b(this.id, (this.factors.hashCode() + ((iHashCode4 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31)) * 31, 31);
        List<Identity> list = this.identities;
        int iHashCode5 = (iB2 + (list == null ? 0 : list.hashCode())) * 31;
        d dVar5 = this.lastSignInAt;
        int iHashCode6 = (iHashCode5 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31;
        String str2 = this.phone;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.role;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar6 = this.updatedAt;
        int iHashCode9 = (iHashCode8 + (dVar6 == null ? 0 : dVar6.hashCode())) * 31;
        c cVar2 = this.userMetadata;
        int iHashCode10 = (iHashCode9 + (cVar2 == null ? 0 : cVar2.f12722k.hashCode())) * 31;
        d dVar7 = this.phoneChangeSentAt;
        int iHashCode11 = (iHashCode10 + (dVar7 == null ? 0 : dVar7.hashCode())) * 31;
        String str4 = this.newPhone;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        d dVar8 = this.emailChangeSentAt;
        int iHashCode13 = (iHashCode12 + (dVar8 == null ? 0 : dVar8.hashCode())) * 31;
        String str5 = this.newEmail;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        d dVar9 = this.invitedAt;
        int iHashCode15 = (iHashCode14 + (dVar9 == null ? 0 : dVar9.hashCode())) * 31;
        d dVar10 = this.recoverySentAt;
        int iHashCode16 = (iHashCode15 + (dVar10 == null ? 0 : dVar10.hashCode())) * 31;
        d dVar11 = this.phoneConfirmedAt;
        int iHashCode17 = (iHashCode16 + (dVar11 == null ? 0 : dVar11.hashCode())) * 31;
        String str6 = this.actionLink;
        return iHashCode17 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserInfo(appMetadata=");
        sb.append(this.appMetadata);
        sb.append(", aud=");
        sb.append(this.aud);
        sb.append(", confirmationSentAt=");
        sb.append(this.confirmationSentAt);
        sb.append(", confirmedAt=");
        sb.append(this.confirmedAt);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", emailConfirmedAt=");
        sb.append(this.emailConfirmedAt);
        sb.append(", factors=");
        sb.append(this.factors);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", identities=");
        sb.append(this.identities);
        sb.append(", lastSignInAt=");
        sb.append(this.lastSignInAt);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", role=");
        sb.append(this.role);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", userMetadata=");
        sb.append(this.userMetadata);
        sb.append(", phoneChangeSentAt=");
        sb.append(this.phoneChangeSentAt);
        sb.append(", newPhone=");
        sb.append(this.newPhone);
        sb.append(", emailChangeSentAt=");
        sb.append(this.emailChangeSentAt);
        sb.append(", newEmail=");
        sb.append(this.newEmail);
        sb.append(", invitedAt=");
        sb.append(this.invitedAt);
        sb.append(", recoverySentAt=");
        sb.append(this.recoverySentAt);
        sb.append(", phoneConfirmedAt=");
        sb.append(this.phoneConfirmedAt);
        sb.append(", actionLink=");
        return A6.b.j(sb, this.actionLink, ')');
    }

    public UserInfo(c cVar, String str, d dVar, d dVar2, d dVar3, String str2, d dVar4, List<UserMfaFactor> list, String str3, List<Identity> list2, d dVar5, String str4, String str5, d dVar6, c cVar2, d dVar7, String str6, d dVar8, String str7, d dVar9, d dVar10, d dVar11, String str8) {
        l.f("aud", str);
        l.f("factors", list);
        l.f("id", str3);
        this.appMetadata = cVar;
        this.aud = str;
        this.confirmationSentAt = dVar;
        this.confirmedAt = dVar2;
        this.createdAt = dVar3;
        this.email = str2;
        this.emailConfirmedAt = dVar4;
        this.factors = list;
        this.id = str3;
        this.identities = list2;
        this.lastSignInAt = dVar5;
        this.phone = str4;
        this.role = str5;
        this.updatedAt = dVar6;
        this.userMetadata = cVar2;
        this.phoneChangeSentAt = dVar7;
        this.newPhone = str6;
        this.emailChangeSentAt = dVar8;
        this.newEmail = str7;
        this.invitedAt = dVar9;
        this.recoverySentAt = dVar10;
        this.phoneConfirmedAt = dVar11;
        this.actionLink = str8;
    }

    public /* synthetic */ UserInfo(c cVar, String str, d dVar, d dVar2, d dVar3, String str2, d dVar4, List list, String str3, List list2, d dVar5, String str4, String str5, d dVar6, c cVar2, d dVar7, String str6, d dVar8, String str7, d dVar9, d dVar10, d dVar11, String str8, int i7, f fVar) {
        this((i7 & 1) != 0 ? null : cVar, str, (i7 & 4) != 0 ? null : dVar, (i7 & 8) != 0 ? null : dVar2, (i7 & 16) != 0 ? null : dVar3, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? null : dVar4, (i7 & 128) != 0 ? y.f7779k : list, str3, (i7 & 512) != 0 ? null : list2, (i7 & 1024) != 0 ? null : dVar5, (i7 & 2048) != 0 ? null : str4, (i7 & 4096) != 0 ? null : str5, (i7 & 8192) != 0 ? null : dVar6, (i7 & 16384) != 0 ? null : cVar2, (32768 & i7) != 0 ? null : dVar7, (65536 & i7) != 0 ? null : str6, (131072 & i7) != 0 ? null : dVar8, (262144 & i7) != 0 ? null : str7, (524288 & i7) != 0 ? null : dVar9, (1048576 & i7) != 0 ? null : dVar10, (2097152 & i7) != 0 ? null : dVar11, (i7 & 4194304) != 0 ? null : str8);
    }
}
