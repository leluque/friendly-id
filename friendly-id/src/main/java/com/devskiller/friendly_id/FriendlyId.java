package com.devskiller.friendly_id;

import java.util.UUID;

/**
 * Class to convert UUID to url Friendly IDs basing on Url62
 */
public class FriendlyId {

	/**
	 * Create FriendlyId id
	 *
	 * @return Friendly Id encoded UUID
	 */
	public static String createFriendlyId() {
		return Url62.create();
	}

	/**
	 * Encode UUID to FriendlyId id
	 *
	 * @param uuid UUID to be encoded
	 * @return Friendly Id encoded UUID
	 */
	public static String toFriendlyId(UUID uuid) {
		return Url62.encode(uuid);
	}

	/**
	 * Decode Friendly Id to UUID
	 *
	 * @param friendlyId encoded UUID
	 * @return decoded UUID
	 */
	public static UUID toUuid(String friendlyId) {
		return Url62.decode(friendlyId);
	}

	/**
	 * Create FriendlyId id
	 *
	 * @return Friendly Id encoded UUID
	 *
	 * @deprecated As of release 1.0.3, replaced by {@link #createFriendlyId()}
	 */
	@Deprecated
	public static String create() {
		return Url62.create();
	}

	/**
	 * Encode UUID to FriendlyId id
	 *
	 * @param uuid UUID to be encoded
	 * @return Friendly Id encoded UUID
	 *
	 * @deprecated As of release 1.0.3, replaced by {@link #toFriendlyId(UUID)}
	 */
	@Deprecated
	public static String encode(UUID uuid) {
		return Url62.encode(uuid);
	}

	/**
	 * Decode Friendly Id to UUID
	 *
	 * @param friendlyId encoded UUID
	 * @return decoded UUID
	 *
	 * @deprecated As of release 1.0.3, replaced by {@link #toUuid(String)}
	 */
	@Deprecated
	public static UUID decode(String friendlyId) {
		return Url62.decode(friendlyId);
	}


}
