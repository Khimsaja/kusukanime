package io.github.jan.supabase.auth.admin;

import O3.C;
import S3.c;
import T3.a;
import e4.k;
import io.github.jan.supabase.auth.SignOutScope;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserMfaFactor;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH¦@¢\u0006\u0002\u0010\tJ'\u0010\n\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH¦@¢\u0006\u0002\u0010\tJ \u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H¦@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u001bJ.\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H¦@¢\u0006\u0002\u0010\"J/\u0010#\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000e2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH¦@¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00142\u0006\u0010\u001a\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u001bJ\u001e\u0010(\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010*¨\u0006+À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminApi;", "", "createUserWithEmail", "Lio/github/jan/supabase/auth/user/UserInfo;", "builder", "Lkotlin/Function1;", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Email;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUserWithPhone", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Phone;", "signOut", "jwt", "", "scope", "Lio/github/jan/supabase/auth/SignOutScope;", "(Ljava/lang/String;Lio/github/jan/supabase/auth/SignOutScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "retrieveUsers", "", "page", "", "perPage", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveUserById", "uid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUser", "inviteUserByEmail", "email", "redirectTo", "data", "Lkotlinx/serialization/json/JsonObject;", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserById", "Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveFactors", "Lio/github/jan/supabase/auth/user/UserMfaFactor;", "deleteFactor", "factorId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AdminApi {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object logout(AdminApi adminApi, String str, SignOutScope signOutScope, c<? super C> cVar) {
            return AdminApi.super.logout(str, signOutScope, cVar);
        }
    }

    static /* synthetic */ Object inviteUserByEmail$default(AdminApi adminApi, String str, String str2, kotlinx.serialization.json.c cVar, c cVar2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inviteUserByEmail");
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            cVar = null;
        }
        return adminApi.inviteUserByEmail(str, str2, cVar, cVar2);
    }

    static /* synthetic */ Object logout$default(AdminApi adminApi, String str, SignOutScope signOutScope, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
        }
        if ((i7 & 2) != 0) {
            signOutScope = SignOutScope.LOCAL;
        }
        return adminApi.logout(str, signOutScope, cVar);
    }

    static Object logout$suspendImpl(AdminApi adminApi, String str, SignOutScope signOutScope, c<? super C> cVar) {
        Object objSignOut = adminApi.signOut(str, signOutScope, cVar);
        return objSignOut == a.f9048k ? objSignOut : C.a;
    }

    static /* synthetic */ Object retrieveUsers$default(AdminApi adminApi, Integer num, Integer num2, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveUsers");
        }
        if ((i7 & 1) != 0) {
            num = null;
        }
        if ((i7 & 2) != 0) {
            num2 = null;
        }
        return adminApi.retrieveUsers(num, num2, cVar);
    }

    static /* synthetic */ Object signOut$default(AdminApi adminApi, String str, SignOutScope signOutScope, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signOut");
        }
        if ((i7 & 2) != 0) {
            signOutScope = SignOutScope.LOCAL;
        }
        return adminApi.signOut(str, signOutScope, cVar);
    }

    Object createUserWithEmail(k kVar, c<? super UserInfo> cVar);

    Object createUserWithPhone(k kVar, c<? super UserInfo> cVar);

    Object deleteFactor(String str, String str2, c<? super C> cVar);

    Object deleteUser(String str, c<? super C> cVar);

    Object inviteUserByEmail(String str, String str2, kotlinx.serialization.json.c cVar, c<? super C> cVar2);

    default Object logout(String str, SignOutScope signOutScope, c<? super C> cVar) {
        return logout$suspendImpl(this, str, signOutScope, cVar);
    }

    Object retrieveFactors(String str, c<? super List<UserMfaFactor>> cVar);

    Object retrieveUserById(String str, c<? super UserInfo> cVar);

    Object retrieveUsers(Integer num, Integer num2, c<? super List<UserInfo>> cVar);

    Object signOut(String str, SignOutScope signOutScope, c<? super C> cVar);

    Object updateUserById(String str, k kVar, c<? super UserInfo> cVar);
}
