package com.mytiki.company_index.features.latest.big_picture;

import java.util.EnumSet;

public enum BigPictureWeight {
    /** TAGS **/
    TAG_3D_PRINTING(1.0,"3D Printing"),
    TAG_ACCOUNTING(8.0,"Accounting"),
    TAG_ADULT(10.0,"Adult"),
    TAG_ADVERTISING(2.0,"Advertising"),
    TAG_AEROSPACE(1.0,"Aerospace"),
    TAG_AEROSPACE_DEFENSE(4.0,"Aerospace & Defense"),
    TAG_AGRICULTURE(1.0,"Agriculture"),
    TAG_AIRLINES(3.0,"Airlines"),
    TAG_ALTERNATIVE_MEDICINE(5.0,"Alternative Medicine"),
    TAG_ANIMATION(1.0,"Animation"),
    TAG_APPAREL_FASHION(1.0,"Apparel & Fashion"),
    TAG_APPAREL_FOOTWEAR(1.0,"Apparel & Footwear"),
    TAG_ARCHITECTURE(1.0,"Architecture"),
    TAG_ART(3.0,"Art"),
    TAG_ARTS(3.0,"Arts"),
    TAG_ARTS_CRAFTS(3.0,"Arts & Crafts"),
    TAG_ASSET_MANAGEMENT(8.0,"Asset Management"),
    TAG_AUDIO(1.0,"Audio"),
    TAG_AUTO_INSURANCE(6.0,"Auto Insurance"),
    TAG_AUTOMATION(1.0,"Automation"),
    TAG_AUTOMOTIVE(3.0,"Automotive"),
    TAG_B2B(1.0,"B2B"),
    TAG_B2C(1.0,"B2C"),
    TAG_BANKING(9.0,"Banking"),
    TAG_BANKING_MORTGAGES(9.0,"Banking & Mortgages"),
    TAG_BEAUTY(3.0,"Beauty"),
    TAG_BEVERAGES(5.0,"Beverages"),
    TAG_BIOTECHNOLOGY(6.0,"Biotechnology"),
    TAG_BITCOIN(7.0,"Bitcoin"),
    TAG_BLOGGING_PLATFORMS(2.0,"Blogging Platforms"),
    TAG_BRAND_MARKETING(1.0,"Brand Marketing"),
    TAG_BREWING(6.0,"Brewing"),
    TAG_BROADBAND(1.0,"Broadband"),
    TAG_BROADCASTING(1.0,"Broadcasting"),
    TAG_BUILDING_MATERIAL(1.0,"Building Material"),
    TAG_BUILDING_MATERIALS(1.0,"Building Materials"),
    TAG_BUSINESS_SUPPLIES(1.0,"Business Supplies"),
    TAG_CANNABIS(10.0,"Cannabis"),
    TAG_CHEMICAL(5.0,"Chemical"),
    TAG_CHEMICALS(5.0,"Chemicals"),
    TAG_CIVIL_ENGINEERING(1.0,"Civil Engineering"),
    TAG_CLOUD_SERVICES(2.0,"Cloud Services"),
    TAG_COMMERCIAL_REAL_ESTATE(1.0,"Commercial Real Estate"),
    TAG_COMMUNICATIONS(4.0,"Communications"),
    TAG_COMPUTER_HARDWARE(1.0,"Computer Hardware"),
    TAG_COMPUTER_NETWORKING(2.0,"Computer Networking"),
    TAG_CONSTRUCTION(1.0,"Construction"),
    TAG_CONSULTING_PROFESSIONAL_SERVICES(4.0,"Consulting & Professional Services"),
    TAG_CONSUMER_DISCRETIONARY(5.0,"Consumer Discretionary"),
    TAG_CONSUMER_ELECTRONICS(1.0,"Consumer Electronics"),
    TAG_CONSUMER_GOODS(2.0,"Consumer Goods"),
    TAG_CONSUMER_STAPLES(1.0,"Consumer Staples"),
    TAG_CORPORATE_BUSINESS(1.0,"Corporate & Business"),
    TAG_COSMETICS(3.0,"Cosmetics"),
    TAG_CRAFT_BEER(6.0,"Craft Beer"),
    TAG_CROWDSOURCING(1.0,"Crowdsourcing"),
    TAG_DATING(8.0,"Dating"),
    TAG_DELIVERY(5.0,"Delivery"),
    TAG_DESIGN(1.0,"Design"),
    TAG_ECOMMERCE(5.0,"E-Commerce"),
    TAG_ECOMMERCE_MARKETPLACES(5.0,"E-Commerce & Marketplaces"),
    TAG_ELEARNING(2.0,"E-Learning"),
    TAG_EDTECH(2.0,"EdTech"),
    TAG_EDUCATION(1.0,"Education"),
    TAG_ELECTRICAL(1.0,"Electrical"),
    TAG_ENERGY(3.0,"Energy"),
    TAG_ENTERPRISE(1.0,"Enterprise"),
    TAG_ENTERTAINMENT_RECREATION(5.0,"Entertainment & Recreation"),
    TAG_EVENTS(3.0,"Events"),
    TAG_EYEWEAR(2.0,"Eyewear"),
    TAG_FACILITIES(1.0,"Facilities"),
    TAG_FAMILY_SERVICES(8.0,"Family Services"),
    TAG_FASHION(2.0,"Fashion"),
    TAG_FINANCE(7.0,"Finance"),
    TAG_FINANCIAL_SERVICES(7.0,"Financial Services"),
    TAG_FINE_ART(5.0,"Fine Art"),
    TAG_FINTECH(8.0,"FinTech"),
    TAG_FISHERY(1.0,"Fishery"),
    TAG_FITNESS(4.0,"Fitness"),
    TAG_FOOD_AND_BEVERAGE(4.0,"Food and Beverage"),
    TAG_FOOD_PRODUCTION(1.0,"Food Production"),
    TAG_FUNDRAISING(6.0,"Fundraising"),
    TAG_FURNITURE(1.0,"Furniture"),
    TAG_GAMBLING_CASINOS(9.0,"Gambling & Casinos"),
    TAG_GAMING(5.0,"Gaming"),
    TAG_GIFT_CARD(1.0,"Gift Card"),
    TAG_GOVERNMENT(8.0,"Government"),
    TAG_GRAPHIC_DESIGN(1.0,"Graphic Design"),
    TAG_GROUND_TRANSPORTATION(1.0,"Ground Transportation"),
    TAG_HEALTH_WELLNESS(6.0,"Health & Wellness"),
    TAG_HEALTH_CARE(8.0,"Health Care"),
    TAG_HIGHER_EDUCATION(4.0,"Higher Education"),
    TAG_HOME_FURNITURE(1.0,"Home & Furniture"),
    TAG_HOME_DECOR(1.0,"Home Décor"),
    TAG_HOME_IMPROVEMENT(2.0,"Home Improvement"),
    TAG_HOSPITALITY(4.0,"Hospitality"),
    TAG_HOTEL(4.0,"Hotel"),
    TAG_HUMAN_RESOURCES(8.0,"Human Resources"),
    TAG_IMPORT_EXPORT(4.0,"Import & Export"),
    TAG_INDUSTRIALS_MANUFACTURING(1.0,"Industrials & Manufacturing"),
    TAG_INFORMATION_TECHNOLOGY_SERVICES(4.0,"Information Technology & Services"),
    TAG_INSURANCE(7.0,"Insurance"),
    TAG_INTERNATIONAL_RELATIONS(3.0,"International Relations"),
    TAG_INTERNATIONAL_TRADE(5.0,"International Trade"),
    TAG_INTERNET(2.0,"Internet"),
    TAG_INVESTMENT(8.0,"Investment"),
    TAG_INVESTMENT_BANKING(8.0,"Investment Banking"),
    TAG_INVESTMENT_MANAGEMENT(8.0,"Investment Management"),
    TAG_ISP(3.0,"ISP"),
    TAG_JEWELRY(5.0,"Jewelry"),
    TAG_LEGAL_SERVICES(9.0,"Legal Services"),
    TAG_LEISURE(1.0,"Leisure"),
    TAG_LIBRARIES(1.0,"Libraries"),
    TAG_LIFESTYLE(2.0,"Lifestyle"),
    TAG_MACHINERY(1.0,"Machinery"),
    TAG_MANUFACTURING(1.0,"Manufacturing"),
    TAG_MARITIME(1.0,"Maritime"),
    TAG_MARKET_RESEARCH(3.0,"Market Research"),
    TAG_MARKETING_ADVERTISING(3.0,"Marketing & Advertising"),
    TAG_MARKETPLACE(3.0,"Marketplace"),
    TAG_MECHANICAL_ENGINEERING(1.0,"Mechanical Engineering"),
    TAG_MEDIA(3.0,"Media"),
    TAG_MEDIA_AND_ENTERTAINMENT(3.0,"Media and Entertainment"),
    TAG_MEDICAL(9.0,"Medical"),
    TAG_MEDICINE(9.0,"Medicine"),
    TAG_MENS(1.0,"Men's"),
    TAG_MESSAGING(7.0,"Messaging"),
    TAG_MILITARY(5.0,"Military"),
    TAG_MINING_METALS(1.0,"Mining & Metals"),
    TAG_MOBILE(2.0,"Mobile"),
    TAG_MOBILE_APPS(1.0,"Mobile Apps"),
    TAG_MOVIES_TV(2.0,"Movies & TV"),
    TAG_MUSEUMS(1.0,"Museums"),
    TAG_MUSIC(2.0,"Music"),
    TAG_NANOTECHNOLOGY(1.0,"Nanotechnology"),
    TAG_NATIONAL_SECURITY(8.0,"National Security"),
    TAG_NETWORK_SECURITY(7.0,"Network Security"),
    TAG_NEWS(1.0,"News"),
    TAG_NUTRITION(6.0,"Nutrition"),
    TAG_OIL_GAS(3.0,"Oil & Gas"),
    TAG_ONLINE_PORTALS(2.0,"Online Portals"),
    TAG_OUTSOURCING(1.0,"Outsourcing"),
    TAG_PACKAGING_CONTAINERS(1.0,"Packaging & Containers"),
    TAG_PAPER_GOODS(2.0,"Paper Goods"),
    TAG_PAYMENTS(9.0,"Payments"),
    TAG_PC_GAMES(2.0,"PC Games"),
    TAG_PHARMACEUTICAL(9.0,"Pharmaceutical"),
    TAG_PHARMACEUTICALS(9.0,"Pharmaceuticals"),
    TAG_PHARMACY(9.0,"Pharmacy"),
    TAG_PHOTOGRAPHY(5.0,"Photography"),
    TAG_PLASTICS(2.0,"Plastics"),
    TAG_PLUMBING(2.0,"Plumbing"),
    TAG_PORNOGRAPHY(10.0,"Pornography"),
    TAG_PRIMARY_SECONDARY_EDUCATION(7.0,"Primary & Secondary Education"),
    TAG_PRINTING(3.0,"Printing"),
    TAG_PROPERTY_MANAGEMENT(5.0,"Property Management"),
    TAG_PUBLIC_RELATIONS(7.0,"Public Relations"),
    TAG_PUBLIC_TRANSPORTATION(1.0,"Public Transportation"),
    TAG_PUBLISHING(1.0,"Publishing"),
    TAG_RANCHING(1.0,"Ranching"),
    TAG_REAL_ESTATE(1.0,"Real Estate"),
    TAG_RENEWABLE_ENERGY(2.0,"Renewable Energy"),
    TAG_RENEWABLES_ENVIRONMENT(2.0,"Renewables & Environment"),
    TAG_RESEARCH(2.0,"Research"),
    TAG_RESTAURANTS(2.0,"Restaurants"),
    TAG_RETAIL(3.0,"Retail"),
    TAG_RIDE_SHARING(6.0,"Ride Sharing"),
    TAG_RISK_MANAGEMENT(7.0,"Risk Management"),
    TAG_SAAS(1.0,"SAAS"),
    TAG_SEARCH_ENGINE(6.0,"Search Engine"),
    TAG_SECURITY(8.0,"Security"),
    TAG_SERVICES(3.0,"Services"),
    TAG_SEX_INDUSTRY(10.0,"Sex Industry"),
    TAG_SHIPBUILDING(1.0,"Shipbuilding"),
    TAG_SHIPPING_LOGISTICS(5.0,"Shipping & Logistics"),
    TAG_SMS(7.0,"SMS"),
    TAG_SOCCER(1.0,"Soccer"),
    TAG_SOCIAL(7.0,"Social"),
    TAG_SOCIAL_MEDIA(7.0,"Social Media"),
    TAG_SOCIAL_NETWORK(7.0,"Social Network"),
    TAG_SPORTING_GOODS(2.0,"Sporting Goods"),
    TAG_SPORTS(2.0,"Sports"),
    TAG_SPORTS_FITNESS(2.0,"Sports & Fitness"),
    TAG_SUPERMARKETS(4.0,"Supermarkets"),
    TAG_TALENT_AGENCIES(3.0,"Talent Agencies"),
    TAG_TECHNOLOGY(5.0,"Technology"),
    TAG_TELECOMMUNICATIONS(4.0,"Telecommunications"),
    TAG_TEXTILES(1.0,"Textiles"),
    TAG_TOBACCO(10.0,"Tobacco"),
    TAG_TOOLS(1.0,"Tools"),
    TAG_TRANSLATION(1.0,"Translation"),
    TAG_TRANSPORTATION(2.0,"Transportation"),
    TAG_TRAVEL_LEISURE(6.0,"Travel & Leisure"),
    TAG_TV(1.0,"TV"),
    TAG_TV_PRODUCTION(1.0,"TV Production"),
    TAG_UTILITIES(6.0,"Utilities"),
    TAG_VENTURE_CAPITAL(1.0,"Venture Capital"),
    TAG_VETERINARY(4.0,"Veterinary"),
    TAG_VIDEO_GAMES(1.0,"Video Games"),
    TAG_VIDEO_STREAMING(3.0,"Video Streaming"),
    TAG_WELLNESS(6.0,"Wellness"),
    TAG_WHOLESALE(1.0,"Wholesale"),
    TAG_WIRELESS(3.0,"Wireless"),

    /** SECTOR **/
    SECTOR_BASIC_MATERIALS(1.0,"Basic Materials"),
    SECTOR_CONSUMER_GOODS(3.0,"Consumer Goods"),
    SECTOR_CONSUMER_SERVICES(5.0,"Consumer Services"),
    SECTOR_FINANCIALS(8.0,"Financials"),
    SECTOR_HEALTH_CARE(9.0,"Health Care"),
    SECTOR_INDUSTRIALS(1.0,"Industrials"),
    SECTOR_OIL_GAS(2.0,"Oil & Gas"),
    SECTOR_TECHNOLOGY(5.0,"Technology"),
    SECTOR_TELECOMMUNICATIONS(3.0,"Telecommunications"),
    SECTOR_UTILITIES(6.0,"Utilities"),

    /** INDUSTRY **/
    INDUSTRY_FORESTRY_PAPER(1.0,"Forestry & Paper"),
    INDUSTRY_INDUSTRIAL_METALS_MINING(1.0,"Industrial Metals & Mining"),
    INDUSTRY_MINING(1.0,"Mining"),
    INDUSTRY_CHEMICALS(5.0,"Chemicals"),
    INDUSTRY_AUTOMOBILES_PARTS(3.0,"Automobiles & Parts"),
    INDUSTRY_BEVERAGES(3.0,"Beverages"),
    INDUSTRY_FOOD_PRODUCERS(1.0,"Food Producers"),
    INDUSTRY_HOUSEHOLD_GOODS_HOME_CONSTRUCTION(1.0,"Household Goods & Home Construction"),
    INDUSTRY_LEISURE_GOODS(4.0,"Leisure Goods"),
    INDUSTRY_PERSONAL_GOODS(4.0,"Personal Goods"),
    INDUSTRY_TOBACCO(10.0,"Tobacco"),
    INDUSTRY_MEDIA(3.0,"Media"),
    INDUSTRY_FOOD_DRUG_RETAILERS(9.0,"Food & Drug Retailers"),
    INDUSTRY_GENERAL_RETAILERS(5.0,"General Retailers"),
    INDUSTRY_TRAVEL_LEISURE(6.0,"Travel & Leisure"),
    INDUSTRY_BANKS(8.0,"Banks"),
    INDUSTRY_EQUITY_INVESTMENT_INSTRUMENTS(8.0,"Equity Investment Instruments"),
    INDUSTRY_FINANCIAL_SERVICES(8.0,"Financial Services"),
    INDUSTRY_NONEQUITY_INVESTMENT_INSTRUMENTS(8.0,"Nonequity Investment Instruments"),
    INDUSTRY_LIFE_INSURANCE(8.0,"Life Insurance"),
    INDUSTRY_NONLIFE_INSURANCE(8.0,"Nonlife Insurance"),
    INDUSTRY_REAL_ESTATE_INVESTMENT_SERVICES(8.0,"Real Estate Investment & Services"),
    INDUSTRY_REAL_ESTATE_INVESTMENT_TRUSTS(8.0,"Real Estate Investment Trusts"),
    INDUSTRY_HEALTH_CARE_EQUIPMENT_SERVICES(9.0,"Health Care Equipment & Services"),
    INDUSTRY_PHARMACEUTICALS_BIOTECHNOLOGY(9.0,"Pharmaceuticals & Biotechnology"),
    INDUSTRY_CONSTRUCTION_MATERIALS(1.0,"Construction & Materials"),
    INDUSTRY_AEROSPACE_DEFENSE(3.0,"Aerospace & Defense"),
    INDUSTRY_ELECTRONIC_ELECTRICAL_EQUIPMENT(1.0,"Electronic & Electrical Equipment"),
    INDUSTRY_GENERAL_INDUSTRIALS(1.0,"General Industrials"),
    INDUSTRY_INDUSTRIAL_ENGINEERING(1.0,"Industrial Engineering"),
    INDUSTRY_INDUSTRIAL_TRANSPORTATION(1.0,"Industrial Transportation"),
    INDUSTRY_SUPPORT_SERVICES(2.0,"Support Services"),
    INDUSTRY_ALTERNATIVE_ENERGY(1.0,"Alternative Energy"),
    INDUSTRY_OIL_GAS_PRODUCERS(3.0,"Oil & Gas Producers"),
    INDUSTRY_OIL_EQUIPMENT_SERVICES_DISTRIBUTION(5.0,"Oil Equipment, Services & Distribution"),
    INDUSTRY_SOFTWARE_COMPUTER_SERVICES(5.0,"Software & Computer Services"),
    INDUSTRY_TECHNOLOGY_HARDWARE_EQUIPMENT(3.0,"Technology Hardware & Equipment"),
    INDUSTRY_FIXED_LINE_TELECOMMUNICATIONS(3.0,"Fixed Line Telecommunications"),
    INDUSTRY_MOBILE_TELECOMMUNICATIONS(3.0,"Mobile Telecommunications"),
    INDUSTRY_ELECTRICITY(6.0,"Electricity"),
    INDUSTRY_GAS_WATER_MULTI_UTILITIES(6.0,"Gas, Water & Multi-utilities"),
    INDUSTRY_GAS_WATER_MULTIUTILITIES(6.0,"Gas, Water & Multiutilities"),

    /** SUB INDUSTRY **/
    SUB_INDUSTRY_FORESTRY(1.0,"Forestry"),
    SUB_INDUSTRY_PAPER(1.0,"Paper"),
    SUB_INDUSTRY_IRON_STEEL(1.0,"Iron & Steel"),
    SUB_INDUSTRY_NONFERROUS_METALS(1.0,"Nonferrous Metals"),
    SUB_INDUSTRY_ALUMINUM(1.0,"Aluminum"),
    SUB_INDUSTRY_DIAMONDS_GEMSTONES(3.0,"Diamonds & Gemstones"),
    SUB_INDUSTRY_GOLD_MINING(3.0,"Gold Mining"),
    SUB_INDUSTRY_PLATINUM_PRECIOUS_METALS(3.0,"Platinum & Precious Metals"),
    SUB_INDUSTRY_COAL(1.0,"Coal"),
    SUB_INDUSTRY_GENERAL_MINING(1.0,"General Mining"),
    SUB_INDUSTRY_SPECIALTY_CHEMICALS(5.0,"Specialty Chemicals"),
    SUB_INDUSTRY_COMMODITY_CHEMICALS(5.0,"Commodity Chemicals"),
    SUB_INDUSTRY_AUTO_PARTS(2.0,"Auto Parts"),
    SUB_INDUSTRY_AUTOMOBILES(4.0,"Automobiles"),
    SUB_INDUSTRY_TIRES(2.0,"Tires"),
    SUB_INDUSTRY_BREWERS(7.0,"Brewers"),
    SUB_INDUSTRY_DISTILLERS_VINTNERS(7.0,"Distillers & Vintners"),
    SUB_INDUSTRY_SOFT_DRINKS(3.0,"Soft Drinks"),
    SUB_INDUSTRY_FARMING_FISHING_PLANTATIONS(1.0,"Farming, Fishing & Plantations"),
    SUB_INDUSTRY_FOOD_PRODUCTS(2.0,"Food Products"),
    SUB_INDUSTRY_FURNISHINGS(1.0,"Furnishings"),
    SUB_INDUSTRY_HOME_CONSTRUCTION(2.0,"Home Construction"),
    SUB_INDUSTRY_NONDURABLE_HOUSEHOLD_PRODUCTS(3.0,"Nondurable Household Products"),
    SUB_INDUSTRY_DURABLE_HOUSEHOLD_PRODUCTS(2.0,"Durable Household Products"),
    SUB_INDUSTRY_RECREATIONAL_PRODUCTS(3.0,"Recreational Products"),
    SUB_INDUSTRY_CONSUMER_ELECTRONICS(4.0,"Consumer Electronics"),
    SUB_INDUSTRY_TOYS(2.0,"Toys"),
    SUB_INDUSTRY_CLOTHING_ACCESSORIES(1.0,"Clothing & Accessories"),
    SUB_INDUSTRY_FOOTWEAR(1.0,"Footwear"),
    SUB_INDUSTRY_PERSONAL_PRODUCTS(3.0,"Personal Products"),
    SUB_INDUSTRY_TOBACCO(10.0,"Tobacco"),
    SUB_INDUSTRY_MEDIA_AGENCIES(3.0,"Media Agencies"),
    SUB_INDUSTRY_BROADCASTING_ENTERTAINMENT(3.0,"Broadcasting & Entertainment"),
    SUB_INDUSTRY_PUBLISHING(3.0,"Publishing"),
    SUB_INDUSTRY_FOOD_RETAILERS_WHOLESALERS(5.0,"Food Retailers & Wholesalers"),
    SUB_INDUSTRY_DRUG_RETAILERS(9.0,"Drug Retailers"),
    SUB_INDUSTRY_APPAREL_RETAILERS(5.0,"Apparel Retailers"),
    SUB_INDUSTRY_SPECIALIZED_CONSUMER_SERVICES(5.0,"Specialized Consumer Services"),
    SUB_INDUSTRY_SPECIALTY_RETAILERS(5.0,"Specialty Retailers"),
    SUB_INDUSTRY_BROADLINE_RETAILERS(5.0,"Broadline Retailers"),
    SUB_INDUSTRY_HOME_IMPROVEMENT_RETAILERS(5.0,"Home Improvement Retailers"),
    SUB_INDUSTRY_AIRLINES(6.0,"Airlines"),
    SUB_INDUSTRY_RECREATIONAL_SERVICES(6.0,"Recreational Services"),
    SUB_INDUSTRY_HOTELS(6.0,"Hotels"),
    SUB_INDUSTRY_RESTAURANTS_BARS(4.0,"Restaurants & Bars"),
    SUB_INDUSTRY_TRAVEL_TOURISM(4.0,"Travel & Tourism"),
    SUB_INDUSTRY_GAMBLING(10.0,"Gambling"),
    SUB_INDUSTRY_BANKS(8.0,"Banks"),
    SUB_INDUSTRY_EQUITY_INVESTMENT_INSTRUMENTS(8.0,"Equity Investment Instruments"),
    SUB_INDUSTRY_INVESTMENT_SERVICES(8.0,"Investment Services"),
    SUB_INDUSTRY_ASSET_MANAGERS(8.0,"Asset Managers"),
    SUB_INDUSTRY_MORTGAGE_FINANCE(8.0,"Mortgage Finance"),
    SUB_INDUSTRY_CONSUMER_FINANCE(8.0,"Consumer Finance"),
    SUB_INDUSTRY_SPECIALTY_FINANCE(8.0,"Specialty Finance"),
    SUB_INDUSTRY_NONEQUITY_INVESTMENT_INSTRUMENTS(8.0,"Nonequity Investment Instruments"),
    SUB_INDUSTRY_LIFE_INSURANCE(8.0,"Life Insurance"),
    SUB_INDUSTRY_REINSURANCE(8.0,"Reinsurance"),
    SUB_INDUSTRY_INSURANCE_BROKERS(8.0,"Insurance Brokers"),
    SUB_INDUSTRY_FULL_LINE_INSURANCE(8.0,"Full Line Insurance"),
    SUB_INDUSTRY_PROPERTY_CASUALTY_INSURANCE(8.0,"Property & Casualty Insurance"),
    SUB_INDUSTRY_REAL_ESTATE_HOLDING_DEVELOPMENT(8.0,"Real Estate Holding & Development"),
    SUB_INDUSTRY_REAL_ESTATE_SERVICES(8.0,"Real Estate Services"),
    SUB_INDUSTRY_HOTEL_LODGING_REITS(8.0,"Hotel & Lodging REITs"),
    SUB_INDUSTRY_SPECIALTY_REITS(8.0,"Specialty REITs"),
    SUB_INDUSTRY_MORTGAGE_REITS(8.0,"Mortgage REITs"),
    SUB_INDUSTRY_DIVERSIFIED_REITS(8.0,"Diversified REITs"),
    SUB_INDUSTRY_INDUSTRIAL_OFFICE_REITS(8.0,"Industrial & Office REITs"),
    SUB_INDUSTRY_RESIDENTIAL_REITS(8.0,"Residential REITs"),
    SUB_INDUSTRY_RETAIL_REITS(8.0,"Retail REITs"),
    SUB_INDUSTRY_MEDICAL_SUPPLIES(8.0,"Medical Supplies"),
    SUB_INDUSTRY_HEALTH_CARE_PROVIDERS(9.0,"Health Care Providers"),
    SUB_INDUSTRY_MEDICAL_EQUIPMENT(9.0,"Medical Equipment"),
    SUB_INDUSTRY_BIOTECHNOLOGY(8.0,"Biotechnology"),
    SUB_INDUSTRY_PHARMACEUTICALS(9.0,"Pharmaceuticals"),
    SUB_INDUSTRY_HEAVY_CONSTRUCTION(1.0,"Heavy Construction"),
    SUB_INDUSTRY_BUILDING_MATERIALS_FIXTURES(1.0,"Building Materials & Fixtures"),
    SUB_INDUSTRY_AEROSPACE(1.0,"Aerospace"),
    SUB_INDUSTRY_DEFENSE(4.0,"Defense"),
    SUB_INDUSTRY_ELECTRONIC_EQUIPMENT(1.0,"Electronic Equipment"),
    SUB_INDUSTRY_ELECTRICAL_COMPONENTS_EQUIPMENT(1.0,"Electrical Components & Equipment"),
    SUB_INDUSTRY_CONTAINERS_PACKAGING(1.0,"Containers & Packaging"),
    SUB_INDUSTRY_DIVERSIFIED_INDUSTRIALS(1.0,"Diversified Industrials"),
    SUB_INDUSTRY_COMMERCIAL_VEHICLES_TRUCKS(3.0,"Commercial Vehicles & Trucks"),
    SUB_INDUSTRY_INDUSTRIAL_MACHINERY(1.0,"Industrial Machinery"),
    SUB_INDUSTRY_MARINE_TRANSPORTATION(1.0,"Marine Transportation"),
    SUB_INDUSTRY_RAILROADS(1.0,"Railroads"),
    SUB_INDUSTRY_TRUCKING(1.0,"Trucking"),
    SUB_INDUSTRY_DELIVERY_SERVICES(5.0,"Delivery Services"),
    SUB_INDUSTRY_TRANSPORTATION_SERVICES(1.0,"Transportation Services"),
    SUB_INDUSTRY_BUSINESS_SUPPORT_SERVICES(5.0,"Business Support Services"),
    SUB_INDUSTRY_FINANCIAL_ADMINISTRATION(8.0,"Financial Administration"),
    SUB_INDUSTRY_WASTE_DISPOSAL_SERVICES(3.0,"Waste & Disposal Services"),
    SUB_INDUSTRY_BUSINESS_TRAINING_EMPLOYMENT_AGENCIES(5.0,"Business Training & Employment Agencies"),
    SUB_INDUSTRY_INDUSTRIAL_SUPPLIERS(1.0,"Industrial Suppliers"),
    SUB_INDUSTRY_RENEWABLE_ENERGY_EQUIPMENT(1.0,"Renewable Energy Equipment"),
    SUB_INDUSTRY_ALTERNATIVE_FUELS(1.0,"Alternative Fuels"),
    SUB_INDUSTRY_INTEGRATED_OIL_GAS(3.0,"Integrated Oil & Gas"),
    SUB_INDUSTRY_EXPLORATION_PRODUCTION(2.0,"Exploration & Production"),
    SUB_INDUSTRY_PIPELINES(3.0,"Pipelines"),
    SUB_INDUSTRY_OIL_EQUIPMENT_SERVICES(4.0,"Oil Equipment & Services"),
    SUB_INDUSTRY_COMPUTER_SERVICES(5.0,"Computer Services"),
    SUB_INDUSTRY_SOFTWARE(5.0,"Software"),
    SUB_INDUSTRY_INTERNET(5.0,"Internet"),
    SUB_INDUSTRY_ELECTRONIC_OFFICE_EQUIPMENT(1.0,"Electronic Office Equipment"),
    SUB_INDUSTRY_TELECOMMUNICATIONS_EQUIPMENT(3.0,"Telecommunications Equipment"),
    SUB_INDUSTRY_SEMICONDUCTORS(3.0,"Semiconductors"),
    SUB_INDUSTRY_COMPUTER_HARDWARE(2.0,"Computer Hardware"),
    SUB_INDUSTRY_FIXED_LINE_TELECOMMUNICATIONS(6.0,"Fixed Line Telecommunications"),
    SUB_INDUSTRY_MOBILE_TELECOMMUNICATIONS(6.0,"Mobile Telecommunications"),
    SUB_INDUSTRY_CONVENTIONAL_ELECTRICITY(6.0,"Conventional Electricity"),
    SUB_INDUSTRY_ALTERNATIVE_ELECTRICITY(6.0,"Alternative Electricity"),
    SUB_INDUSTRY_MULTI_UTILITIES(6.0,"Multi-utilities"),
    SUB_INDUSTRY_GAS_DISTRIBUTION(6.0,"Gas Distribution"),
    SUB_INDUSTRY_WATER(6.0,"Water");

    private static final EnumSet<BigPictureWeight> allOf = EnumSet.allOf(BigPictureWeight.class);

    private final double weight;
    private final String lookup;

    BigPictureWeight(double weight, String lookup) {
        this.weight = weight;
        this.lookup = lookup;
    }

    public double getWeight() {
        return weight;
    }

    public Object getLookup() {
        return lookup;
    }

    public static BigPictureWeight forLookup(String lookup) {
        for (BigPictureWeight e : allOf) {
            if (e.getLookup().equals(lookup))
                return e;
        }
        return null;
    }
}
